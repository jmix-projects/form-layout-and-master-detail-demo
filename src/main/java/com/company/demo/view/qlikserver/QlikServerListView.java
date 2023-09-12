package com.company.demo.view.qlikserver;

import com.company.demo.entity.QlikServer;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikServers", layout = MainView.class)
@ViewController("QlikServer.list")
@ViewDescriptor("qlik-server-list-view.xml")
@LookupComponent("qlikServersDataGrid")
@DialogMode(width = "64em")
public class QlikServerListView extends StandardListView<QlikServer> {
}