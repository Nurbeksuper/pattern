package com.company.creational.abstractFactory.website;

import com.company.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM");
    }
}
