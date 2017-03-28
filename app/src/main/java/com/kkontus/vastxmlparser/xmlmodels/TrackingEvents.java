package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrackingEvents {
    @SerializedName("Tracking")
    private List<Tracking> Tracking;

    public List<Tracking> getTracking() {
        return Tracking;
    }

    public void setTracking(List<Tracking> tracking) {
        Tracking = tracking;
    }
}
