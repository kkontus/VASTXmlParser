package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Icon {
    private IconClicks IconClicks;
    @SerializedName("IconViewTracking")
    private List<String> IconViewTracking;

    public IconClicks getIconClicks() {
        return IconClicks;
    }

    public void setIconClicks(IconClicks iconClicks) {
        IconClicks = iconClicks;
    }

    public List<String> getIconViewTracking() {
        return IconViewTracking;
    }

    public void setIconViewTracking(List<String> iconViewTracking) {
        IconViewTracking = iconViewTracking;
    }
}
