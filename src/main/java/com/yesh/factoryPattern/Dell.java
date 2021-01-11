package com.yesh.factoryPattern;

public class Dell extends Laptop {

    private String ram;
    private String processor;

    Dell(String ramSize, String processorType){
        this.ram = ramSize;
        this.processor = processorType;
    }

    public String getConfiguration() {
        return "Dell RAM size : " + this.ram + " and Processor type : " + this.processor;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
