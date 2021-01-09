package com.yesh.singletonPattorn;

public class Singleton {

    private static Singleton lazyInit = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(lazyInit == null){
            synchronized (Singleton.class){
                if (lazyInit == null){
                    lazyInit = new Singleton();
                }
            }
        }
        return lazyInit;
    }
}
