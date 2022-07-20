package com.aj.ui.kanban;

import com.vaadin.flow.component.dnd.DragSource;
import com.vaadin.flow.component.dnd.DropTarget;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class KanbanCard extends FlexLayout implements DragSource<KanbanBoard>, DropTarget<KanbanBoard> {

    public KanbanCard() {
        this.setWidthFull();
        this.setFlexDirection(FlexDirection.ROW);
        this.setFlexWrap(FlexWrap.NOWRAP);
        this.setAlignContent(ContentAlignment.START);
        this.setDraggable(true);
        this.setDraggable(true);
    }


}
