package com.company.demo.view.qlikuser;

import com.company.demo.entity.QlikUser;
import com.company.demo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "qlikUsers/:id", layout = MainView.class)
@ViewController("QlikUser.detail")
@ViewDescriptor("qlik-user-detail-view.xml")
@EditedEntityContainer("qlikUserDc")
public class QlikUserDetailView extends StandardDetailView<QlikUser> {
}