package com.ynz.demo.usingsealedclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoSealedClass {
    public static void main(String[] args) {
        Person p1 = new Developer("Mike", "Pass");
        Person p2 = new Manager("Mia", "Senior");

        identifyInstance(p1);
        identifyInstance(p2);
    }

    public static void identifyInstance(Person person) {
        if (person instanceof Developer developer) {
            log.info("it is a developer {}", developer);
        } else if (person instanceof Manager manager) {
            log.info("it is a manager {}", manager);
        }
    }
}
