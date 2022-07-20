package com.aj.ui.kanban;

import aj.csi.DateUtil;
import aj.csi.dalsvc.DalUtil;
import com.aj.ui.reusables.LayoutUtil;
import com.aj.ui.views.MainLayout;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.charts.model.Tooltip;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.Route;

import javax.swing.*;

@Route(value = "kanban-pm", layout = MainLayout.class)
public class KanbanBoardContainerPMTeam extends Div {

    private static final String AVATAR_BK_COLR = "#efa0cf";                    //var(--lumo-primary-color-10pct)
    private static final String VAR_LUMO_ERROR_COLOR_10PCT = "var(--lumo-error-color-10pct)";
    private static final String COLOR1 = "var(--lumo-primary-color-10pct)";
    private FlexLayout boardLayout;
    private FlexLayout boardLayout2;
    private FlexLayout boardLayout3;
    private FlexLayout boardLayout4;
    private FlexLayout bottomSectionLayout;
    private FlexLayout mainLayout;
    private FlexLayout cardLayout1;
    private FlexLayout cardLayout2;
    private int cardHeight = 150;

    public KanbanBoardContainerPMTeam(){
       mainLayout=createMain();
        cardLayout1 = createCards("Rathi ilanthalir / Tiruppur", "RI");
        cardLayout2 = createCards("Niranjan / Karur IN", "NP");
        FlexLayout cardLayout3 = createCards("Devasena / Namakkal IN", "DS");
        FlexLayout cardLayout4 = createCards("Shaswin Akash / Karur IN", "SA");
        FlexLayout cardLayout5 = createCards("Akhil / Coimbatore IN", "AM");
        FlexLayout cardLayout6 = createCards("Adhithyan / Karur IN", "AN");
        FlexLayout cardLayout7 = createCards("Mottu / Pogo TV", "MP");

        boardLayout.add(cardLayout1,cardLayout2,cardLayout4);
        boardLayout2.add(cardLayout3,cardLayout5);
        boardLayout3.add(cardLayout6);
        boardLayout4.add(cardLayout7);
        add(mainLayout);

    }
    private FlexLayout createMain(){
        FlexLayout mainLayout = LayoutUtil.getFlexHorizontalLayout(true);
        mainLayout.addClassName("mainLayout");
        mainLayout.getStyle().set("font-family", "Calibri");
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
        Label labelBoard = new Label("New");
        labelBoard.getStyle().set("font-size", "large");
        labelBoard.getStyle().set("text-decoration", "underline");
        labelBoard.getStyle().set("font-weight", "600");
        labelBoard.getStyle().set("text-align", "left");
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
        labelBoard2.getStyle().set("font-size", "large");
        labelBoard2.getStyle().set("text-decoration", "underline");
        labelBoard2.getStyle().set("font-weight", "600");
        labelBoard2.getStyle().set("text-align", "left");
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
        labelBoard3.getStyle().set("font-size", "large");
        labelBoard3.getStyle().set("text-decoration", "underline");
        labelBoard3.getStyle().set("font-weight", "600");
        labelBoard3.getStyle().set("text-align", "left");
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
        labelBoard4.getStyle().set("font-size", "large");
        labelBoard4.getStyle().set("text-decoration", "underline");
        labelBoard4.getStyle().set("font-weight", "600");
        labelBoard4.getStyle().set("text-align", "left");
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
        bottomSectionLayout=createComboBox();
//        cardLayout.setHeight(cardHeight, Unit.PIXELS);
        cardLayout.getStyle().set("height", "fit-content");
        cardLayout.setWidth(95, Unit.PERCENTAGE);
        cardLayout.getStyle().set("border-radius","0.50em");
        cardLayout.getStyle().set("font-family", "Calibri");       //cursive

        cardLayout.getStyle().set("background-color", "#efebeb");
        cardLayout.getStyle().set("margin", "5px");
        cardLayout.getStyle().set("box-shadow", "rgb(0 0 0 / 24%) 0px 3px 8px !important");

        FlexLayout contentLayout = LayoutUtil.getFlexVerticalLayout(true);
        contentLayout.getElement().getStyle().set("padding", "0px");
        contentLayout.getElement().getStyle().set("gap", "0px");
        contentLayout.getStyle().set("margin-top","21px");
        contentLayout.getStyle().set("margin-right","25px");
        contentLayout.getStyle().set("width","unset");

        addId("ID : 12345",contentLayout);
        addTitle(name, contentLayout);
        addSubTitle("9884024699", contentLayout);
        addDate(DateUtil.formatDate(DateUtil.getToday()), contentLayout);
//        addSubTitle("seksnk@gmail.com",contentLayout);

        FlexLayout topSectionLayout = LayoutUtil.getFlexHorizontalLayout(true);
        topSectionLayout.setAlignContent(FlexLayout.ContentAlignment.START);
        FlexLayout buttonLayout = LayoutUtil.getFlexHorizontalLayout(true);
        buttonLayout.getStyle().set("height", "fit-content");
        buttonLayout.getStyle().set("width", "unset");
        buttonLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.END);
        /*Button viewButton = new Button("", new Icon(VaadinIcon.EDIT));
        viewButton.addThemeVariants(ButtonVariant.LUMO_ICON);
        viewButton.getElement().getStyle().set("margin-right", "-2px");*/
        H3 widget = createDataWidget(AVATAR_BK_COLR, initial);
        buttonLayout.add(widget,bottomSectionLayout);

        contentLayout.add(topSectionLayout);
        contentLayout.setAlignItems(FlexComponent.Alignment.START);
        cardLayout.add(contentLayout,buttonLayout);
        return cardLayout;
    }

    private FlexLayout createComboBox(){
        FlexLayout bottomSectionLayout = LayoutUtil.getFlexHorizontalLayout(true);
        ComboBox<String> boardSelection = new ComboBox<>();
        boardSelection.setWidth("150px");
        boardSelection.getStyle().set("margin-top","105px");
//        boardSelection.setItems(boardLayout,boardLayout2,boardLayout3,boardLayout4);
        boardSelection.setPlaceholder("Select Board to Move");
        boardSelection.setItems("New","Follow-up","Prospect","Deal");
        boardSelection.addValueChangeListener(event -> {
            if (event.getValue().equals("New")){
                boardLayout.add(cardLayout1,cardLayout2);
                boardLayout2.remove(cardLayout1);
            }else if (event.getValue().equals("Follow-up")){
                boardLayout2.add(cardLayout1);
                boardLayout.remove(cardLayout1);
                boardLayout4.remove(cardLayout1);
                boardLayout3.remove(cardLayout1);
           } else if (event.getValue().equals("Prospect")) {
                boardLayout3.add(cardLayout1);
                boardLayout.remove(cardLayout1);
                boardLayout2.remove(cardLayout1);
                boardLayout4.remove(cardLayout1);
           } else if (event.getValue().equals("Deal")) {
                boardLayout4.add(cardLayout1);
                boardLayout.remove(cardLayout1);
                boardLayout2.remove(cardLayout1);
                boardLayout3.remove(cardLayout1);
            }
        });
        bottomSectionLayout.add(boardSelection);
        return bottomSectionLayout;
    }

    private void addId(String content, FlexLayout contentLayout) {
        Span title = new Span(content);
        title.getElement().getStyle().set("margin-left", "36px");
        title.getElement().getStyle().set("margin-top", "-24px");
        title.setWidth(67, Unit.PIXELS);
        title.getStyle().set("text-decoration", "underline");
        title.getStyle().set("color", "#096381");
        title.addClickListener(spanClickEvent -> {
           title.getUI().ifPresent(ui -> {
               ui.navigate(KanbanBoardContainerNew.class);
           });
        });
        Image image = new Image("icons/badge-32.png","");
        image.setWidth("27px");
        image.getStyle().set("margin-top", "-9px");
        Image image1 = new Image("icons/fb_icon.png", "");
        image1.setWidth("27px");
        image1.getStyle().set("margin-left", "106px");
        image1.getStyle().set("margin-top", "-29px");
//        image1.getStyle().set("height", "fit-content");
//        contentLayout.setAlignSelf(FlexComponent.Alignment.CENTER, title);
        contentLayout.add(image,title,image1);
    }
    private void addDate(String date, FlexLayout bottomSectionLayout){
        Span nowDate = new Span(date);
        nowDate.getStyle().set("margin-left", "122px");
        nowDate.getStyle().set("margin-top", "-19px");
        Image image = new Image("icons/calendar-16.png", "");
        image.getStyle().set("margin-top","-22px");
        image.getStyle().set("margin-left","104px");
        bottomSectionLayout.setAlignSelf(FlexComponent.Alignment.CENTER, nowDate);
        bottomSectionLayout.add(image,nowDate);
    }

    private void addSubTitle(String locationContact, FlexLayout contentLayout) {
        Span title = new Span(locationContact);
        title.getElement().getStyle().set("margin-left", "18px");
        title.getStyle().set("margin-top", "-20px");
        Image image = new Image("icons/telephone-16.png", "");
        image.getStyle().set("margin-top","38px");
        contentLayout.add(image,title);
    }

    private void addTitle(String name, FlexLayout contentLayout) {
        Span title = new Span(name);
        title.getElement().getStyle().set("margin-left", "20px");
        title.getElement().getStyle().set("margin-top", "15px");
        contentLayout.add(title);
    }

    private H3 createDataWidget(String color, String headerStr) {

        H3 header = new H3(headerStr);
        header.getStyle().set("width", "45px");
        header.getStyle().set("height", "25px");
//        header.getStyle().set("margin-bottom", "25px");
        header.getStyle().set("margin-top", "10px");
        header.getStyle().set("margin-left", "8px");
        header.getStyle().set("margin-right", "-137px");
        header.getStyle().set("text-align", "center");
        header.getStyle().set("border-radius", "0.25em");
        header.getStyle().set("background-color", color);

        return header;
    }
}
