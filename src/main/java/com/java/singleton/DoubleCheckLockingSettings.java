package com.java.singleton;

public class DoubleCheckLockingSettings {
    private static volatile DoubleCheckLockingSettings INSTANCE;

    private DoubleCheckLockingSettings() {}

    public DoubleCheckLockingSettings getInstance(){
        if(INSTANCE == null) {
            synchronized (DoubleCheckLockingSettings.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSettings();
                }
            }
        }
        return INSTANCE;
    }
}
