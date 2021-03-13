package com.cubycode.clickme.model;

public class ProfileSettingsModel {

    private String settingsName;
    private String settingsDescription;

    public ProfileSettingsModel(String settingsName, String settingsDescription) {
        this.settingsName = settingsName;
        this.settingsDescription = settingsDescription;
    }

    public String getSettingsName() {
        return settingsName;
    }

    public void setSettingsName(String settingsName) {
        this.settingsName = settingsName;
    }

    public String getSettingsDescription() {
        return settingsDescription;
    }

    public void setSettingsDescription(String settingsDescription) {
        this.settingsDescription = settingsDescription;
    }
}
