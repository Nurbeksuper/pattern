package com.company.creational.abstractFactory.banking;

import com.company.creational.abstractFactory.Developer;
import com.company.creational.abstractFactory.ProjectManager;
import com.company.creational.abstractFactory.ProjectTeamFactory;
import com.company.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
