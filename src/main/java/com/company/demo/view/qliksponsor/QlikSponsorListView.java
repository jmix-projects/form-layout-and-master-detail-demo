package com.company.demo.view.qliksponsor;

import com.company.demo.entity.QlikSponsor;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikSponsors", layout = MainView.class)
@ViewController("QlikSponsor.list")
@ViewDescriptor("qlik-sponsor-list-view.xml")
@LookupComponent("qlikSponsorsDataGrid")
@DialogMode(width = "64em")
public class QlikSponsorListView extends StandardListView<QlikSponsor> {
}