package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoClicks {
    private String ClickThrough;
    @SerializedName("ClickTracking")
    private List<ClickTracking> ClickTracking;
    @SerializedName("CustomClick")
    private List<CustomClick> CustomClick;

    public String getClickThrough() {
        return ClickThrough;
    }

    public void setClickThrough(String clickThrough) {
        ClickThrough = clickThrough;
    }

    public List<ClickTracking> getClickTracking() {
        return ClickTracking;
    }

    public void setClickTracking(List<ClickTracking> clickTracking) {
        ClickTracking = clickTracking;
    }

    public List<CustomClick> getCustomClick() {
        return CustomClick;
    }

    public void setCustomClick(List<CustomClick> customClick) {
        CustomClick = customClick;
    }
}
