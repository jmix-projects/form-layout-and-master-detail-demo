package com.company.demo.view.qlikuser;

import com.company.demo.entity.QlikUser;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikUsers", layout = MainView.class)
@ViewController("QlikUser.list")
@ViewDescriptor("qlik-user-list-view.xml")
@LookupComponent("qlikUsersDataGrid")
@DialogMode(width = "64em")
public class QlikUserListView extends StandardListView<QlikUser> {
}