package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Tracking {
    @SerializedName("$")
    public String value;
    @SerializedName("@event")
    private String event;
    @SerializedName("@offset")
    private String offset;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
