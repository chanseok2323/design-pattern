package com.java.singleton;

import java.io.Serializable;

public class StaticClassHolderSettings implements Serializable {
    private StaticClassHolderSettings() {}

    private static class SettingsHolder {
        private static final StaticClassHolderSettings INSTANCE = new StaticClassHolderSettings();
    }

    public static StaticClassHolderSettings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 대응 (역직령화 시 사용)
    protected Object readResolve() {
        return getInstance();
    }
}
