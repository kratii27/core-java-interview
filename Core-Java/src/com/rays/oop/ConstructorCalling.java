package com.rays.oop;

public class ConstructorCalling {

   public String name;
   public String address;
   public String phoneNo;

   public ConstructorCalling(String name, String address){
       this.name = name;
       this.address = address;
       System.out.println(name);
       System.out.println(address);
   }

    public ConstructorCalling(String name, String address, String phoneNo){
        this(name, address);
        this.phoneNo = phoneNo;
        System.out.println(phoneNo);
    }


}
