package com.company.creational.abstractFactory.website;

import com.company.creational.abstractFactory.Developer;
import com.company.creational.abstractFactory.ProjectManager;
import com.company.creational.abstractFactory.ProjectTeamFactory;
import com.company.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
