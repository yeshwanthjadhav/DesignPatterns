package com.yesh.singletonPattorn;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//We can break singleton class using Reflection and Serialization, here we use reflection
public class BreakSingleton {
    public static void main(String args[]){

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            constructor.setAccessible(true);
            try {
                s2 = (Singleton) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" s1 " + s1);
        System.out.println(" s2 " + s2);
    }
}
