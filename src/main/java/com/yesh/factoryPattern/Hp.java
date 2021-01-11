package com.yesh.factoryPattern;

public class Hp extends Laptop {

    private String ram;
    private String processor;

    Hp(String ramSize, String processorType){
        this.ram = ramSize;
        this.processor = processorType;
    }

    public String getConfiguration() {
        return "Hp RAM size : " + this.ram + " and Processor type : " + this.processor;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
