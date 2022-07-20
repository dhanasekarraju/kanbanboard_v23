package com.aj.ui.kanban;

import aj.csi.CaseyException;
import aj.csi.ConfigurationService;
import aj.csi.dalsvc.bo.MetadataService;
import aj.csi.dalsvc.bo.NewLeadDataService;
import com.aj.ui.reusables.Lead;
import com.aj.ui.reusables.LeadDataService;
import com.aj.ui.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Route(value = "kanban-board", layout = MainLayout.class)
public class KanbanBoardContainer extends Div {
    private final Lead lead;
    private LeadDataService leadDataService;
    private ConfigurationService configurationService;
    Grid<Lead> grid1 = new Grid<>();
    Grid<Lead> grid2 = new Grid<>();
    Grid<Lead> grid3 = new Grid<>();
    Grid<Lead> grid4 = new Grid<>();

    public KanbanBoardContainer() {

        this.configurationService = new ConfigurationService();
        MetadataService metadataService = new MetadataService(configurationService);
        this.leadDataService = new LeadDataService();
        this.lead= new Lead();
        addClassName("kanban");
        setSizeUndefined();

        grid1.setHeight("100%");
        grid1 = new Grid<Lead>(Lead.class, false);
        grid1.setSelectionMode(Grid.SelectionMode.MULTI);
//        grid1.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid1.addColumn(Lead::getSubscriptionStatus).setHeader("Subscription");
//        grid1.addComponentColumn(lead -> createCard(lead));
        Set<Lead> leadSet = null;
        try {
            leadSet = this.leadDataService.findAll("");
        } catch (CaseyException e) {
            throw new RuntimeException(e);
        }
        grid1.setItems(leadSet);

        grid2.setHeight("100%");
//        grid2.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid2.addComponentColumn(person -> createCard(lead));

        grid3.setHeight("100%");
//        grid3.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid3.addComponentColumn(person -> createCard(lead));

        grid4.setHeight("100%");
//        grid4.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid4.addComponentColumn(person -> createCard(lead));

        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();

        layout.setSpacing(true);
        layout.add(grid1, grid2, grid3, grid4);
        add(layout);

    }

    private void createBoard(){
        Collection<Lead> leadCollection = new ArrayList<>();



    }
    private void createCombobox(){
        ComboBox<Lead> assignee = new ComboBox<>();
    }
    private HorizontalLayout createCard(Lead lead) {
        HorizontalLayout card = new HorizontalLayout();
        card.addClassName("card");
        card.setSpacing(false);
        card.getThemeList().add("spacing-s");

        Image image = new Image();
        image.setSrc(lead.getUserPic());
        VerticalLayout description = new VerticalLayout();
        description.addClassName("description");
        description.setSpacing(false);
        description.setPadding(false);

        HorizontalLayout header = new HorizontalLayout();
        header.addClassName("header");
        header.setSpacing(false);
        header.getThemeList().add("spacing-s");

        Span name = new Span(lead.getFirstName());
        name.addClassName("name");
        Span date = new Span(String.valueOf(lead.getSessionTime()));
        date.addClassName("date");
        header.add(name, date);

        Span post = new Span(lead.getSubscriptionStatus());
        post.addClassName("post");

        HorizontalLayout actions = new HorizontalLayout();
        actions.addClassName("actions");
        actions.setSpacing(false);
        actions.getThemeList().add("spacing-s");

        Icon likeIcon = new Icon("vaadin", "heart");
        Span likes = new Span();
        likes.addClassName("likes");
        Icon commentIcon = new Icon("vaadin", "comment");
        Span comments = new Span();
        comments.addClassName("comments");
        Icon shareIcon = new Icon("vaadin", "connect");
        Span shares = new Span();
        shares.addClassName("shares");

        actions.add(likeIcon, likes, commentIcon, comments, shareIcon, shares);

        description.add(header, post, actions);
        card.add(image, description);
        return card;
    }
    private void createButton(FlexLayout buttonLayout){
        Button addCard = new Button("Add");
        Icon icon = new Icon("vaadin","plus");
        addCard.setIcon(icon);
        addCard.addClickListener(clickEvent -> {

        });

        Button editButton = new Button("Edit");
        Icon editIcon = new Icon("vaadin", "pen");
        editButton.setIcon(editIcon);
        editButton.addClickListener(editEvent ->{

        });

        Button deleteButton = new Button("Delete");
        Icon delIcon = new Icon("vaadin","delete");
        deleteButton.setIcon(delIcon);
        deleteButton.addClickListener(clickEvent -> {

        });
    }
}
