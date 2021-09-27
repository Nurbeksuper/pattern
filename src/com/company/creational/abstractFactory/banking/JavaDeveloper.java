package com.company.creational.abstractFactory.banking;

import com.company.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java");
    }
}
