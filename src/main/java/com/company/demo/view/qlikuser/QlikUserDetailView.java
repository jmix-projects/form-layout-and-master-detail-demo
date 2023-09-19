package com.company.demo.view.qlikuser;

import com.company.demo.entity.QlikLicense;
import com.company.demo.entity.QlikUser;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;

import java.time.LocalDate;

@Route(value = "qlikUsers/:id", layout = MainView.class)
@ViewController("QlikUser.detail")
@ViewDescriptor("qlik-user-detail-view.xml")
@EditedEntityContainer("qlikUserDc")
public class QlikUserDetailView extends StandardDetailView<QlikUser> {

    @ViewComponent
    private InstanceContainer<QlikUser> qlikUserDc;

    @Install(to = "qlikLicensesDataGrid.create", subject = "initializer")
    private void qlikLicensesDataGridCreateInitializer(final QlikLicense qlikLicense) {
        qlikLicense.setUser(qlikUserDc.getItem());
        qlikLicense.setExpDate(LocalDate.now());
    }
}