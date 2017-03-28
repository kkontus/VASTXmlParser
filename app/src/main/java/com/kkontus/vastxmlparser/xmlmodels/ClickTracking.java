package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class ClickTracking {
    @SerializedName("$")
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
