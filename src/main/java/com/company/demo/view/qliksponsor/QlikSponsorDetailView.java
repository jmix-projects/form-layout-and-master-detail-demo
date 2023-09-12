package com.company.demo.view.qliksponsor;

import com.company.demo.entity.QlikSponsor;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikSponsors/:id", layout = MainView.class)
@ViewController("QlikSponsor.detail")
@ViewDescriptor("qlik-sponsor-detail-view.xml")
@EditedEntityContainer("qlikSponsorDc")
public class QlikSponsorDetailView extends StandardDetailView<QlikSponsor> {
}