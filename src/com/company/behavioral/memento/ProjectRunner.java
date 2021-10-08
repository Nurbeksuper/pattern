package com.company.behavioral.memento;

public class ProjectRunner {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("creating 1.0");
        project.setVersioAndDate("versio 1.0");

        System.out.println(project);

        System.out.println("saving current version to github...");
        github.setSave(project.save());

        System.out.println("updating version 1.1");

        System.out.println("writing poor code...");
        Thread.sleep(5000);

        project.setVersioAndDate("version 1.1");

        System.out.println(project);

        System.out.println("something went wrong...");

        System.out.println("rolling back to version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
