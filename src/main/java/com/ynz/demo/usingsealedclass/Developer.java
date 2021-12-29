package com.ynz.demo.usingsealedclass;

import lombok.ToString;

@ToString(callSuper = true)
public non-sealed class Developer extends Person {
    private final String department;

    public Developer(String name, String department){
        super(name);
        this.department = department;
    }
}
