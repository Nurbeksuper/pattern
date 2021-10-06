package com.company.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github");

        project.run();
    }
}
