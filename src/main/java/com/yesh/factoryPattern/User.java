package com.yesh.factoryPattern;

public class User {

    public static void main (String[] args){
        /*
        Laptop dell = new Dell("8gb", "Intel");
        //Laptop mac = new Mac("12gb", "Intel");
        Laptop hp = new Hp("10gb", "AMD");

        System.out.println(dell.getConfiguration());
        System.out.println(dell.toString());

        //System.out.println(mac.getConfiguration());
        //System.out.println(mac.toString());

        System.out.println(hp.getConfiguration());
        System.out.println(hp.toString());


        //suppose there is a change in Mac object, then all the user classes need to update the object
        Laptop mac = new Mac("12gb", "Intel", "AMD");
        System.out.println(mac.getConfiguration());
        System.out.println(mac.toString());
        */

        //To over come this problem we go with factory pattern
        //Create enum LaptopType and LaptopFactory class

        Laptop dell = LaptopFactory.getLaptop(LaptopType.DELL);
        Laptop mac = LaptopFactory.getLaptop(LaptopType.MAC);
        Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);

        System.out.println(dell.getConfiguration());
        System.out.println(dell.toString());
        System.out.println();
        System.out.println(mac.getConfiguration());
        System.out.println(mac.toString());
        System.out.println();
        System.out.println(hp.getConfiguration());
        System.out.println(hp.toString());

    }

}
