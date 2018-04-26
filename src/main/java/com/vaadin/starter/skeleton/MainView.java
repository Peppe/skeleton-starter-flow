package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        final TextField name = new TextField();
        name.setLabel("Type your name here:");

        Button button = new Button("Click me",
                event -> add(new Label("Thanks " + name.getValue() + ", it works!")));

        add(name, button);
        setClassName("main-layout");
    }
}
