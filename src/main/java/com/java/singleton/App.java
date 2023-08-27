package com.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        StaticClassHolderSettings settings1 = StaticClassHolderSettings.getInstance();
        Constructor<StaticClassHolderSettings> constructor = StaticClassHolderSettings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticClassHolderSettings settings2 = constructor.newInstance();

        System.out.println("(settings1 == settings2 = " + (settings1 == settings2));
    }

}
