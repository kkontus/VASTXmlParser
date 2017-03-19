package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Ad {
    @SerializedName("@id")
    private String id;
    private InLine InLine;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.kkontus.vastxmlparser.xmlmodels.InLine getInLine() {
        return InLine;
    }

    public void setInLine(com.kkontus.vastxmlparser.xmlmodels.InLine inLine) {
        InLine = inLine;
    }
}
