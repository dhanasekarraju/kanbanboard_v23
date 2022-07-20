package com.aj.ui.kanban;

import aj.csi.DateUtil;
import com.aj.ui.reusables.LayoutUtil;
import com.aj.ui.reusables.Lead;
import com.aj.ui.views.MainLayout;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Objects;

@Route(value = "kanban-new", layout = MainLayout.class)
public class KanbanBoardContainerNew extends Div {

    private static final String AVATAR_BK_COLR = "var(--lumo-primary-color-10pct)";
    private static final String VAR_LUMO_ERROR_COLOR_10PCT = "var(--lumo-error-color-10pct)";
    private static final String COLOR1 = "var(--lumo-primary-color-10pct)";
    private FlexLayout boardLayout;
    private FlexLayout boardLayout2;
    private FlexLayout boardLayout3;
    private FlexLayout boardLayout4;
    private FlexLayout topSectionLayout;
    private FlexLayout mainLayout;
    private FlexLayout cardLayout1;
    private FlexLayout cardLayout2;
    private int cardHeight = 150;

    public KanbanBoardContainerNew(){
       mainLayout=createMain();
        cardLayout1 = createCards("Rathi ilanthalir/Tiruppur", "RI");
        cardLayout2 = createCards("Niranjan/Karur", "NP");
        FlexLayout cardLayout3 = createCards("Devasena/Namakkal", "DS");
        FlexLayout cardLayout4 = createCards("Shaswin Akash/Karur", "SA");
        FlexLayout cardLayout5 = createCards("Akhil/Coimbatore", "AM");
        FlexLayout cardLayout6 = createCards("Adhithyan/Karur", "AN");
        FlexLayout cardLayout7 = createCards("Mottu/pogo", "MP");

        boardLayout.add(cardLayout1,cardLayout2,cardLayout4);
        boardLayout2.add(cardLayout3,cardLayout5);
        boardLayout3.add(cardLayout6);
        boardLayout4.add(cardLayout7);
        add(mainLayout);

    }
    private FlexLayout createMain(){
        FlexLayout mainLayout = LayoutUtil.getFlexHorizontalLayout(true);
        mainLayout.addClassName("mainLayout");
        boardLayout=createBoard();
        boardLayout2=createBoardTwo();
        boardLayout3=createBoardThree();
        boardLayout4=createBoardFour();
        mainLayout.add(boardLayout,boardLayout2,boardLayout3,boardLayout4);
        return mainLayout;
    }
    private FlexLayout createBoard() {
        FlexLayout boardLayout = LayoutUtil.getFlexVerticalLayout(true);
        boardLayout.addClassName("boardLayout");
        boardLayout.setSizeUndefined();
        Label labelBoard = new Label("Fresh");
        labelBoard.getStyle().set("font-size", "x-large");
        labelBoard.getStyle().set("font-weight", "600");
        labelBoard.getStyle().set("text-align", "center");
        boardLayout.getStyle().set("background-color", "aquamarine");
//        boardLayout.setHeight(((3 * cardHeight) + cardHeight), Unit.PIXELS);
        boardLayout.setHeight("900px");
        boardLayout.setWidth(23, Unit.PERCENTAGE);
        boardLayout.getStyle().set("margin-top", "25px");
        boardLayout.getStyle().set("margin-left", "20px");
        boardLayout.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");
        boardLayout.add(labelBoard);
        return boardLayout;
    }

    private FlexLayout createBoardTwo() {
        FlexLayout boardLayout2 = LayoutUtil.getFlexVerticalLayout(true);
        boardLayout2.addClassName("boardLayout2");
        Label labelBoard2 = new Label("Follow-up");
        labelBoard2.getStyle().set("font-size", "x-large");
        labelBoard2.getStyle().set("font-weight", "600");
        labelBoard2.getStyle().set("text-align", "center");
        boardLayout2.getStyle().set("background-color", "#7ff9ff");
        boardLayout2.setHeight("900px");
//        boardLayout2.setHeight(((3 * cardHeight) + cardHeight), Unit.PIXELS);
        boardLayout2.setWidth(23, Unit.PERCENTAGE);
        boardLayout2.getStyle().set("margin-top", "25px");
        boardLayout2.getStyle().set("margin-left", "20px");
        boardLayout2.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");
        boardLayout2.add(labelBoard2);
        return boardLayout2;
    }

    private FlexLayout createBoardThree() {
        FlexLayout boardLayout3 = LayoutUtil.getFlexVerticalLayout(true);
        boardLayout3.addClassName("boardLayout3");
        Label labelBoard3 = new Label("Prospect");
        labelBoard3.getStyle().set("font-size", "x-large");
        labelBoard3.getStyle().set("font-weight", "600");
        labelBoard3.getStyle().set("text-align", "center");
        boardLayout3.getStyle().set("background-color", "#ceff7f");
        boardLayout3.setHeight("900px");
//        boardLayout2.setHeight(((3 * cardHeight) + cardHeight), Unit.PIXELS);
        boardLayout3.setWidth(23, Unit.PERCENTAGE);
        boardLayout3.getStyle().set("margin-top", "25px");
        boardLayout3.getStyle().set("margin-left", "20px");
        boardLayout3.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");
        boardLayout3.add(labelBoard3);
        return boardLayout3;
    }

    private FlexLayout createBoardFour() {
        FlexLayout boardLayout4 = LayoutUtil.getFlexVerticalLayout(true);
        boardLayout4.addClassName("boardLayout3");
        Label labelBoard4 = new Label("Deal");
        labelBoard4.getStyle().set("font-size", "x-large");
        labelBoard4.getStyle().set("font-weight", "600");
        labelBoard4.getStyle().set("text-align", "center");
        boardLayout4.getStyle().set("background-color", "#a1d8e1");
        boardLayout4.setHeight("900px");
//        boardLayout2.setHeight(((3 * cardHeight) + cardHeight), Unit.PIXELS);
        boardLayout4.setWidth(23, Unit.PERCENTAGE);
        boardLayout4.getStyle().set("margin-top", "25px");
        boardLayout4.getStyle().set("margin-left", "20px");
        boardLayout4.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");
        boardLayout4.add(labelBoard4);
        return boardLayout4;
    }

    private FlexLayout createCards(String name, String initial) {
        final KanbanCard cardLayout = new KanbanCard();
        cardLayout.addClassName("cardLayout");
        cardLayout.setHeight(cardHeight, Unit.PIXELS);
        cardLayout.setWidth(95, Unit.PERCENTAGE);

        Icon cardIcon = new Icon("vaadin-icon", "vaadin.facebook");
        cardLayout.getStyle().set("background-color", "darkgray");
        cardLayout.getStyle().set("margin", "5px");
        cardLayout.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");
        // addTitle(name, cardLayout);
        H2 widget = createDataWidget(AVATAR_BK_COLR, initial);
        cardLayout.add(widget);

        FlexLayout contentLayout = LayoutUtil.getFlexVerticalLayout(true);
        contentLayout.getElement().getStyle().set("padding", "0px");
        contentLayout.getElement().getStyle().set("gap", "0px");
        addTitle(name, contentLayout);
        addSubTitle("9884024699/9942818111", contentLayout);
        addSubTitle("seksnk@gmail.com",contentLayout);
        addContent("Modified on "+ DateUtil.formatDate(DateUtil.getToday()), contentLayout);

        FlexLayout bottomSectionLayout = LayoutUtil.getFlexHorizontalLayout(false);
        bottomSectionLayout.setAlignContent(FlexLayout.ContentAlignment.START);
        FlexLayout buttonLayout = LayoutUtil.getFlexHorizontalLayout(false);
        topSectionLayout = createComboBox();
        buttonLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.END);
        Button viewButton = new Button("", new Icon(VaadinIcon.EDIT));
        viewButton.addThemeVariants(ButtonVariant.LUMO_ICON);
        viewButton.getElement().getStyle().set("margin-right", "5px");
        buttonLayout.add(viewButton);
        bottomSectionLayout.add(topSectionLayout);

        contentLayout.add(bottomSectionLayout);
        contentLayout.setAlignItems(FlexComponent.Alignment.START);
        cardLayout.add(contentLayout,buttonLayout);

        return cardLayout;
    }

    private FlexLayout createComboBox(){
        FlexLayout topSectionLayout = LayoutUtil.getFlexHorizontalLayout(true);
        ComboBox<FlexLayout> boardSelection = new ComboBox<>();
        boardSelection.setWidth("210px");
//        boardSelection.setItems(boardLayout,boardLayout2,boardLayout3,boardLayout4);
        boardSelection.setPlaceholder("Select Board to Move");
        boardSelection.setItems(boardLayout,boardLayout2,boardLayout3,boardLayout4);
        boardSelection.addValueChangeListener(event -> {
           if (event.getValue().equals(boardLayout2)){
               boardLayout2.add(cardLayout1);
               boardLayout.remove(cardLayout1);
           } else if (event.getValue().equals(boardLayout3)) {
               boardLayout3.add(cardLayout2);
               boardLayout.remove(cardLayout2);
           }
        });
        topSectionLayout.add(boardSelection);
        return topSectionLayout;
    }

    private void addContent(String content, FlexLayout contentLayout) {
        Span title = new Span(content);
        title.getElement().getStyle().set("margin-left", "5px");
        title.setWidth(95, Unit.PERCENTAGE);
        contentLayout.setAlignSelf(FlexComponent.Alignment.CENTER, title);
        contentLayout.add(title);
    }

    private void addSubTitle(String locationContact, FlexLayout contentLayout) {
        Span title = new Span(locationContact);
        title.getElement().getStyle().set("margin-left", "5px");
        contentLayout.add(title);
    }

    private void addTitle(String name, FlexLayout contentLayout) {
        Span title = new Span(name);
        title.getElement().getStyle().set("margin-left", "5px");
        contentLayout.add(title);
    }

    private H2 createDataWidget(String color, String headerStr) {

        H2 header = new H2(headerStr);
        header.getStyle().set("width", "55px");
        header.getStyle().set("height", "fit-content");
        header.getStyle().set("margin-bottom", "25px");
        header.getStyle().set("margin-top", "25px");
        header.getStyle().set("margin-left", "10px");
        header.getStyle().set("margin-right", "10px");
        header.getStyle().set("text-align", "center");
        header.getStyle().set("background-color", color);

        return header;
    }
}
