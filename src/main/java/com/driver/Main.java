package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly obj = new RWOnly();
//      obj.name = "Sowmya";
//      'name' has private access in 'com.driver.RWOnly'
      obj.setName("Sowmya");
      System.out.println(obj.getName());
  }
}