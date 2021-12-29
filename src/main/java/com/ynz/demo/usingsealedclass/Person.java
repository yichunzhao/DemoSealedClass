package com.ynz.demo.usingsealedclass;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public sealed abstract class Person permits Developer, Manager {
    private String name;
}
