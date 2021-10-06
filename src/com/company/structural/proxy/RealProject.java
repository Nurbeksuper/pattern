package com.company.structural.proxy;

public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }
    public void load(){
        System.out.println("Load "+url);
    }

    @Override
    public void run() {
        System.out.println("Running "+ url);
    }
}
