package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Ad {
    @SerializedName("@id")
    private String id;
    @SerializedName("@sequence")
    private String sequence;
    private InLine InLine;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public InLine getInLine() {
        return InLine;
    }

    public void setInLine(InLine inLine) {
        InLine = inLine;
    }
}
