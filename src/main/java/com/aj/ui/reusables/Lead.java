package com.aj.ui.reusables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.frekele.elasticsearch.mapping.annotations.ElasticBooleanField;
import org.frekele.elasticsearch.mapping.annotations.ElasticDateField;
import org.frekele.elasticsearch.mapping.annotations.ElasticDocument;
import org.frekele.elasticsearch.mapping.annotations.ElasticIntegerField;
import org.frekele.elasticsearch.mapping.annotations.ElasticKeywordField;
import org.frekele.elasticsearch.mapping.annotations.ElasticObjectField;
import org.frekele.elasticsearch.mapping.annotations.ElasticTextField;
import org.frekele.elasticsearch.mapping.annotations.values.BoolValue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ElasticDocument("lead")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lead implements Serializable {

	private static final long serialVersionUID = -3294798255539377142L;

	@ElasticKeywordField
	private String id;

	@ElasticTextField
	private String firstName;

	@ElasticTextField
	private String lastName;

	@ElasticTextField
	private String phoneNumber;

	@ElasticTextField
	private String emailId;

	@ElasticTextField

	private String leadAddress = "NA";

	@ElasticTextField
	private String alternateNumber = "NA";

	@ElasticKeywordField
	private String sourceCampaignId = "NA";

	@ElasticKeywordField
	private String ipAddress = "NA";

	@ElasticKeywordField
	@ElasticTextField
	private String userFedLocation = "NA";

	@ElasticKeywordField
	private String ipLocation = "NA";

	@ElasticKeywordField
	@ElasticBooleanField
	private Boolean isSmsVerified = false;

	@ElasticTextField
	private String verificationCode = "NA";

	@ElasticKeywordField
	private String sourceFormId = "NA";

	@ElasticTextField
	private String sourceAccountId = "NA";

	@ElasticKeywordField
	private String campaignName = "NA";

	@ElasticKeywordField
	private String salesCopyName = "NA";

	@ElasticIntegerField
	@ElasticKeywordField
	private Integer sessionTime = 0;

	/*@ElasticDateField
	@ElasticKeywordField
	private Date dueDate = DateUtil.getNowDate();

	@ElasticDateField
	@ElasticKeywordField
	private Date createdDate = DateUtil.getNowDate();

	@ElasticDateField
	@ElasticKeywordField
	private Date modifiedDate = DateUtil.getNowDate();*/

	@ElasticKeywordField
	@ElasticTextField
	private String junoBusinessAlias;

	@ElasticKeywordField
	@ElasticTextField
	private String junoBusinessId;

	@ElasticKeywordField
	@ElasticTextField
	private String junoAccountId;

	@ElasticKeywordField
	@ElasticTextField
	private String junoAccountAlias;

	@ElasticKeywordField
	@ElasticTextField
	private String ownerUserId;

	@ElasticTextField
	private String tenantId;

	@ElasticKeywordField
	@ElasticTextField
	private String campaignType;

	@ElasticKeywordField
	@ElasticTextField
	private String platformType;

	@ElasticKeywordField
	@ElasticTextField
	private String LeadStatus;

	@ElasticKeywordField
	@ElasticTextField
	private String LeadOwner;

	@ElasticKeywordField
	@ElasticTextField
	private String WebsiteUrl;

	@ElasticKeywordField
	@ElasticTextField
	private String saleValue;

	@ElasticKeywordField
	@ElasticTextField
	private String logCount;

	/*@ElasticObjectField(enabledJson = @BoolValue(false))
	private OrganizationInfo orgInfo = new OrganizationInfo();
	@ElasticObjectField(enabledJson = @BoolValue(false))
	private DeviceInfo deviceInfo = new DeviceInfo();
	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<Integer, LeadAsset> assetMap = new HashMap<Integer, LeadAsset>();
	@ElasticObjectField(enabledJson = @BoolValue(false))
	private List<TagLineItem> tagCloud = new ArrayList<TagLineItem>();
	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<String, FollowupLineItem> followupMap = new HashMap<String, FollowupLineItem>();

	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<String, Question> lapQuestionMap = new LinkedHashMap<String, Question>();

	@ElasticObjectField(enabledJson = @BoolValue(false))
	private List<NotificationLineItem> notificationList = new ArrayList<NotificationLineItem>();

	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<Integer, TaskItem> taskMap = new LinkedHashMap<>();

	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<Integer, Meeting> meetMap = new LinkedHashMap<>();

	@ElasticObjectField(enabledJson = @BoolValue(false))
	private Map<Integer, LogInfo> logInfo = new LinkedHashMap<>();*/

	@ElasticTextField
	private String smsVerificationText = "NA";

	@ElasticBooleanField
	private Boolean isTestLead = false;

	@ElasticTextField
	private String userPic = "NA";

	@ElasticTextField
	private String userSub = "NA";

	@ElasticTextField
	private String subscriptionStatus = "NA";

	/*@ElasticObjectField(enabledJson = @BoolValue(false))
	private CatalogueItem pricingDetail;*/

	@ElasticTextField
	private String password;

	/*@ElasticObjectField(enabledJson = @BoolValue(false))
	private CountryMaster countryMaster = CountryMaster.defaultCountryCode();*/

	@ElasticKeywordField
	private String ownerId;

	@ElasticKeywordField
	private String authorityId;
	@ElasticKeywordField
	private Boolean isMeetingEditOpen = false;
	@ElasticKeywordField
	private Boolean isTaskEditOpen = false;

	@ElasticKeywordField
	private Boolean isAttachmentEditOpen = false;

	public Lead() {
		super();
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return leadAddress;
	}

	public void setAddress(String address) {
		this.leadAddress = address;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	/*public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}*/

	public String getSourceCampaignId() {
		return sourceCampaignId;
	}

	public void setSourceCampaignId(String sourceCampaignId) {
		this.sourceCampaignId = sourceCampaignId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserFedLocation() {
		return userFedLocation;
	}

	public void setUserFedLocation(String userFedLocation) {
		this.userFedLocation = userFedLocation;
	}

	public String getIpLocation() {
		return ipLocation;
	}

	public void setIpLocation(String ipLocation) {
		this.ipLocation = ipLocation;
	}

	public Boolean getIsSmsVerified() {
		return isSmsVerified;
	}

	public void setIsSmsVerified(Boolean isSmsVerified) {
		this.isSmsVerified = isSmsVerified;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	/*public Map<Integer, LeadAsset> getAssetMap() {
		return assetMap;
	}

	public void setAssetMap(Map<Integer, LeadAsset> assetMap) {

		this.assetMap = assetMap;
	}

	public List<TagLineItem> getTagCloud() {
		return tagCloud;
	}

	public void setTagCloud(List<TagLineItem> tagCloud) {
		this.tagCloud = tagCloud;
	}

	public Map<String, FollowupLineItem> getFollowupMap() {
		return followupMap;
	}

	public void setFollowupMap(Map<String, FollowupLineItem> followupMap) {
		this.followupMap = followupMap;
	}*/

	public String getSourceFormId() {
		return sourceFormId;
	}

	public void setSourceFormId(String sourceFormId) {
		this.sourceFormId = sourceFormId;
	}

	public String getSourceAccountId() {
		return sourceAccountId;
	}

	public void setSourceAccountId(String sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getSalesCopyName() {
		return salesCopyName;
	}

	public void setSalesCopyName(String salesCopyName) {
		this.salesCopyName = salesCopyName;
	}

	public Integer getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(Integer sessionTime) {
		this.sessionTime = sessionTime;
	}

	/*public OrganizationInfo getOrgInfo() {
		return orgInfo;
	}

	public void setOrgInfo(OrganizationInfo orgInfo) {
		this.orgInfo = orgInfo;
	}

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}*/

	public String getSmsVerificationText() {
		return smsVerificationText;
	}

	public void setSmsVerificationText(String smsVerificationText) {
		this.smsVerificationText = smsVerificationText;
	}

	public Boolean getIsTestLead() {
		return isTestLead;
	}

	public void setIsTestLead(Boolean isTestLead) {
		this.isTestLead = isTestLead;
	}

	/*public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}*/

	public String getUserPic() {
		return userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}

	public String getUserSub() {
		return userSub;
	}

	public void setUserSub(String userSub) {
		this.userSub = userSub;
	}

	public String getLeadStatus() {
		return LeadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		LeadStatus = leadStatus;
	}

	public String getLeadOwner() {
		return LeadOwner;
	}

	public void setLeadOwner(String leadOwner) {
		LeadOwner = leadOwner;
	}

	public String getLogCount() {
		return logCount;
	}

	public void setLogCount(String logCount) {
		this.logCount = logCount;
	}

	/*public Map<Integer, TaskItem> getTaskMap() {
		return taskMap;
	}

	public void addTaskItem(TaskItem item) {
		this.taskMap.put(item.getId(), item);
	}

	public void addMeetItem(Meeting item) {
		this.meetMap.put(item.getId(), item);
	}

	public void addAssetItem(LeadAsset item) {
		this.assetMap.put(item.getId(), item);
	}

	public void removeTaskItem(TaskItem item) {
		if (this.taskMap.containsKey(item.getId())) {
			this.taskMap.remove(item.getId(), item);
		}
	}*/

	/*public Integer getTaskMaxId() {

		Integer maxId = 0;
		Iterator<Integer> iterator = this.taskMap.keySet().iterator();
		while (iterator.hasNext()) {
			int currentId = iterator.next();
			if (currentId > maxId)
				maxId = currentId;
		}
		return maxId;

	}

	public Integer getMeetMaxId() {

		Integer maxId = 0;
		Iterator<Integer> iterator = this.meetMap.keySet().iterator();
		while (iterator.hasNext()) {
			int currentId = iterator.next();
			if (currentId > maxId)
				maxId = currentId;
		}
		return maxId;

	}

	public Integer getAssetMaxId() {

		Integer maxId = 0;
		Iterator<Integer> iterator = this.assetMap.keySet().iterator();
		while (iterator.hasNext()) {
			int currentId = iterator.next();
			if (currentId > maxId)
				maxId = currentId;
		}
		return maxId;

	}

	public Integer getLogMaxId() {

		Integer maxId = 0;
		Iterator<Integer> iterator = this.logInfo.keySet().iterator();
		while (iterator.hasNext()) {
			int currentId = iterator.next();
			if (currentId > maxId)
				maxId = currentId;
		}
		return maxId;

	}*/

	public String getWebsiteUrl() {
		return WebsiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		WebsiteUrl = websiteUrl;
	}

	public String getSaleValue() {
		return saleValue;
	}

	public void setSaleValue(String saleValue) {
		this.saleValue = saleValue;
	}

	/*public Map<String, Question> getLapQuestionMap() {
		return lapQuestionMap;
	}

	public void setLapQuestionMap(LinkedHashMap<String, Question> lapQuestionMap) {
		this.lapQuestionMap = lapQuestionMap;
	}

	public void addQuestionAnswer(String questionId, Question questionAndAnswer) {
		this.lapQuestionMap.put(questionId, questionAndAnswer);
	}

	public List<NotificationLineItem> getNotificationList() {
		return notificationList;
	}

	public void setNotificationList(List<NotificationLineItem> notificationList) {
		this.notificationList = notificationList;
	}

	public Map<Integer, Meeting> getMeetMap() {
		return meetMap;
	}

	public void addNotification(String message, Set<String> channels) {
		NotificationLineItem n = new NotificationLineItem();
		n.setTargetEmail(this.emailId);
		n.setTargetNumber(this.phoneNumber);
		n.setMessage(message);
		n.setChannelList(channels);
		n.setSentDate(DateUtil.getNowDate());
		this.notificationList.add(n);
	}

	public void addFollowupLineItem(String id, FollowupLineItem fli) {
		if (fli != null && id != null)
			this.followupMap.put(id, fli);
	}*/

	public String getJunoBusinessAlias() {
		return junoBusinessAlias;
	}

	public void setJunoBusinessAlias(String businessAlias) {
		this.junoBusinessAlias = businessAlias;
	}

	public String getJunoBusinessId() {
		return junoBusinessId;
	}

	public void setJunoBusinessId(String businessId) {
		if (businessId != null) {
			this.junoBusinessId = businessId;
		}

	}

	public String getJunoAccountId() {
		return junoAccountId;
	}

	public void setJunoAccountId(String junoAccountId) {
		if (junoAccountId != null) {
			this.junoAccountId = junoAccountId;
		}
	}

	public String getJunoAccountAlias() {
		return junoAccountAlias;
	}

	public void setJunoAccountAlias(String junoAccountAlias) {
		this.junoAccountAlias = junoAccountAlias;
	}

	public String getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	/*public CatalogueItem getPricingDetail() {
		return pricingDetail;
	}

	public void setPricingDetail(CatalogueItem pricingDetail) {
		this.pricingDetail = pricingDetail;
	}*/

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public CountryMaster getCountryMaster() {
		return countryMaster;
	}

	public void setCountryMaster(CountryMaster countryMaster) {
		this.countryMaster = countryMaster;
	}*/

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public Boolean getIsMeetingEditOpen() {
		return isMeetingEditOpen;
	}

	public void setIsMeetingEditOpen(Boolean isMeetingEditOpen) {
		this.isMeetingEditOpen = isMeetingEditOpen;
	}

	public Boolean getIsTaskEditOpen() {
		return isTaskEditOpen;
	}

	public void setIsTaskEditOpen(Boolean isTaskEditOpen) {
		this.isTaskEditOpen = isTaskEditOpen;
	}

	public Boolean getIsAttachmentEditOpen() {
		return isAttachmentEditOpen;
	}

	public void setIsAttachmentEditOpen(Boolean isAttachmentEditOpen) {
		this.isAttachmentEditOpen = isAttachmentEditOpen;
	}

	/*public Map<Integer, LogInfo> getLogInfo() {
		return logInfo;
	}

	public void addLogInfo(LogInfo info) throws CaseyException {
		if (info != null && info.getLogId() != null) {
			if (!this.logInfo.containsKey(info.getLogId())) {
				this.logInfo.put(info.getLogId(), info);
			}
			else {
				throw new CaseyException("Cannot add an existing loginfo object"+info.getLogId());
			}
		}
	}

	public void updateLogInfo(LogInfo info) throws CaseyException 
	{
		if (info != null && info.getLogId() != null) {
			if (this.logInfo.containsKey(info.getLogId())) {
				this.logInfo.put(info.getLogId(), info);
			}
			else {
				throw new CaseyException("Cannot update an absent loginfo object"+info.getLogId());
			}
		}
	}
	
	public void removeLogInfo(LogInfo info) throws CaseyException 
	{
		if (info != null && info.getLogId() != null) {
			if (this.logInfo.containsKey(info.getLogId())) {
				//this.logInfo.put(info.getLogId(), info);
				//info.setStatus("REMOVED");
			}
			else {
				throw new CaseyException("Cannot update an absent loginfo object"+info.getLogId());
			}
		}
	}
	
	public Collection<LogInfo> listLogInfo()
	{
		return this.logInfo.values();
	}*/

}
