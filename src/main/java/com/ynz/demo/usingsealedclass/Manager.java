package com.ynz.demo.usingsealedclass;

import lombok.ToString;

@ToString(callSuper = true)
public final class Manager extends Person {
  private final String title;

  public Manager(String name, String title) {
    super(name);
    this.title = title;
  }
}
