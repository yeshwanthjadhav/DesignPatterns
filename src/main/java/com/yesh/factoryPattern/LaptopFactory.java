package com.yesh.factoryPattern;

public class LaptopFactory {

    public static Laptop getLaptop(LaptopType laptopType){
        switch (laptopType){
            case DELL :
                return new Dell("8gb", "Intel");
            case HP:
                return new Mac("12gb", "Intel", "AMD");
            case MAC:
                return new Hp("10gb", "AMD");
        }
        return null;

    }
}
