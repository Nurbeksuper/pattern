package com.company.creational.factory;

public class Program {

    public static void main(String[] args) {

        DeveloperFactory developerFactory = createSpec("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createSpec(String name){
        if (name.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (name.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("asdf");
        }
    }
}
