package com.company.demo.view.qliklicense;

import com.company.demo.entity.QlikLicense;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "qlikLicenses/:id", layout = MainView.class)
@ViewController("QlikLicense.detail")
@ViewDescriptor("qlik-license-detail-view.xml")
@EditedEntityContainer("qlikLicenseDc")
public class QlikLicenseDetailView extends StandardDetailView<QlikLicense> {
}