package com.company.demo.view.qlikserver;

import com.company.demo.entity.QlikServer;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikServers/:id", layout = MainView.class)
@ViewController("QlikServer.detail")
@ViewDescriptor("qlik-server-detail-view.xml")
@EditedEntityContainer("qlikServerDc")
public class QlikServerDetailView extends StandardDetailView<QlikServer> {
}