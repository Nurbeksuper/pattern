package com.company.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
