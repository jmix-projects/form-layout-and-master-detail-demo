package com.company.demo.view.qlikuser;

import com.company.demo.entity.QlikLicense;
import com.company.demo.entity.QlikUser;

import com.company.demo.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.action.list.CreateAction;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;

import java.time.LocalDate;

@Route(value = "qlikUsers", layout = MainView.class)
@ViewController("QlikUser.list")
@ViewDescriptor("qlik-user-list-view.xml")
@LookupComponent("qlikUsersDataGrid")
@DialogMode(width = "64em")
public class QlikUserListView extends StandardListView<QlikUser> {

    @ViewComponent("qlikLicensesDataGrid.create")
    private CreateAction<QlikLicense> qlikLicensesDataGridCreate;
    @ViewComponent
    private CollectionContainer<QlikUser> qlikUsersDc;

    @Subscribe(id = "qlikUsersDc", target = Target.DATA_CONTAINER)
    public void onQlikUsersDcItemChange(final InstanceContainer.ItemChangeEvent<QlikUser> event) {
      qlikLicensesDataGridCreate.setEnabled(event.getItem() != null);
    }

    @Install(to = "qlikLicensesDataGrid.create", subject = "initializer")
    private void qlikLicensesDataGridCreateInitializer(final QlikLicense qlikLicense) {
        qlikLicense.setUser(qlikUsersDc.getItem());
        qlikLicense.setExpDate(LocalDate.now());
    }
}