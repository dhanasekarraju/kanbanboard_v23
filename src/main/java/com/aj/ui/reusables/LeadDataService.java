package com.aj.ui.reusables;

import aj.csi.CaseyException;
import aj.csi.FacetDisplay;
import aj.csi.dalsvc.*;
import aj.csi.search.CaseySearchResponse;
import aj.csi.search.DisplayFacetSet;
import aj.csi.search.SelectedFacetSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.elasticsearch.action.search.SearchResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class LeadDataService {
	private static final Logger logger = LoggerFactory.getLogger(LeadDataService.class);
	private final static Class<Lead> ownerClazz = Lead.class;
	private IndexLowlevelApi indexApi;
	protected final ObjectMapper objectMapper = new ObjectMapper();
	protected FacetDisplay facetDisplay;

/*
	public LeadDataService(ConfigurationService configService, MetadataService metadataService) {
		super(configService, metadataService.getConfig(Lead.class.getName()));
	}
*/

	public CaseySearchResponse<Lead> findByDateAndText(String dateColumn, String alias, String filterTerm, Date fromDate, Date toDate) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByDateAndText(dateColumn, alias, filterTerm, fromDate, toDate, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByDateAndTerm(String dateColumn, String alias, Date fromDate, Date toDate, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByDateAndText(dateColumn, alias, (String)null, fromDate, toDate, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByDate(String dateColumn, String alias, Date fromDate, Date toDate) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByDate(alias, dateColumn, fromDate, toDate, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByTerm(String alias, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByTerm(alias, selectedFacet, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByText(String alias, String filterTerm) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.freeTextSearch(alias, filterTerm, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByTextAndTerm(String alias, String filterTerm, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByTextAndTerm(alias, filterTerm, selectedFacet, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByDateAndTextAndTerm(String dateColumn, String alias, String filterTerm, Date fromDate, Date toDate, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		CaseySearchResponse<Lead> response = this.indexApi.findByDateAndTextAndTerm(dateColumn, alias, filterTerm, fromDate, toDate, selectedFacet, ownerClazz);
		return response;
	}

	public CaseySearchResponse<Lead> findByDateOrText(String dateColumn, String alias, String filterTerm, Date fromDate, Date toDate) throws CaseyException {
		return null;
	}

	public CaseySearchResponse<Lead> findByDateOrTerm(String dateColumn, String alias, Date fromDate, Date toDate, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		return null;
	}

	public CaseySearchResponse<Lead> findByTextOrTerm(String alias, String filterTerm, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		return null;
	}

	public CaseySearchResponse<Lead> findByDateOrTextOrTerm(String dateColumn, String alias, String filterTerm, Date fromDate, Date toDate, SelectedFacetSet<Lead> selectedFacet) throws CaseyException {
		return null;
	}

	public Set<Lead> findAll(String alias) throws CaseyException {
		Set<Lead> bizObjSet = this.indexApi.findAll(alias, ownerClazz);
		return bizObjSet;
	}

	public Lead add(Lead lead) throws CaseyException {
		String leadId = DalUtil.plainUUID();
		lead.setId(leadId);
		logger.info("Adding lead data to lead store with name {} and id {}", lead.getFirstName(), lead.getId());
		return (Lead)this.indexApi.addToIndex(lead).left;
	}

	public DalResponse update(Lead lead) throws CaseyException {
		return this.indexApi.update(lead);
	}

	public DalResponse delete(Lead lead) throws CaseyException {
		return this.indexApi.deleteFromIndex(lead);
	}

	public Lead get(String id) throws CaseyException {
		Map<String, Object> bizObjectMap = this.indexApi.get(id);
		return this.convertMapToDlp(bizObjectMap);
	}

	public Lead convertMapToDlp(Map<String, Object> map) {
		return (Lead)this.objectMapper.convertValue(map, ownerClazz);
	}

	/*public DisplayFacetSet<Lead> fetchDisplayFacetWithAggregates() {
		Map<String, ImmutablePair<String, Set<FacetReport>>> facetMap = new HashMap();

		try {
			facetMap = SearchUtil.generateFacet(this.facetDisplay, this.facetFields, this.elasticSvc, this.schemaName, this.tableName);
		} catch (CaseyException var3) {
		}

		return new DisplayFacetSet((Map)facetMap);
	}*/

	public Set<Lead> filterByBusinessId(String businessId) throws CaseyException {
		Set<Lead> result = this.indexApi.filterByBusinessId(businessId, ownerClazz);
		return result;
	}

	public Set<Lead> filterByAccountId(String accountId) throws CaseyException {
		Set<Lead> result = this.indexApi.filterByAccountId(accountId, ownerClazz);
		return result;
	}

	/*public Set<Lead> findLeadsInAlias(String aliasName) throws CaseyException {
		logger.info("Finding all the leads from schema {}", aliasName);
		SearchResponse searchResponse = SearchUtil.executeFindAllRequest(aliasName, this.elasticSvc);
		Set<Lead> leadList = this.indexApi.getSearchResult(searchResponse, ownerClazz);
		logger.info("Found all the leads from schema" + aliasName + ", total lead count=" + SearchUtil.getCount(leadList));
		return leadList;
	}*/
}
