package com.company.creational.abstractFactory.banking;

import com.company.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM");
    }
}
