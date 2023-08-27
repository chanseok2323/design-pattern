package com.java.singleton;

import java.io.*;

public class SerializableApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StaticClassHolderSettings settings = StaticClassHolderSettings.getInstance();
        StaticClassHolderSettings settings1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }


        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (StaticClassHolderSettings) in.readObject();
        }

        System.out.println("settings != settings1 = " + (settings != settings1));
    }
}
