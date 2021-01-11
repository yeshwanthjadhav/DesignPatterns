package com.yesh.factoryPattern;

public class Mac extends Laptop {

    private String ram;
    private String processor;
    private String gpu;

    Mac(String ramSize, String processorType, String gpuType){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpuType;
    }

    public String getConfiguration() {
        return "Mac RAM size : " + this.ram + ", Processor type : " + this.processor + " and GPU type : " + this.gpu;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
