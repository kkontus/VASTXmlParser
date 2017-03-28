package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IconClicks {
    private String IconClickThrough;
    @SerializedName("IconClickTracking")
    private List<String> IconClickTracking;

    public String getIconClickThrough() {
        return IconClickThrough;
    }

    public void setIconClickThrough(String iconClickThrough) {
        IconClickThrough = iconClickThrough;
    }

    public List<String> getIconClickTracking() {
        return IconClickTracking;
    }

    public void setIconClickTracking(List<String> iconClickTracking) {
        IconClickTracking = iconClickTracking;
    }
}
