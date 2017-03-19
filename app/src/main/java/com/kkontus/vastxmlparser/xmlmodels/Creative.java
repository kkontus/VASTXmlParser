package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Creative {
    @SerializedName("@sequence")
    private String sequence;
    @SerializedName("@id")
    private String id;
    private Linear Linear;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.kkontus.vastxmlparser.xmlmodels.Linear getLinear() {
        return Linear;
    }

    public void setLinear(com.kkontus.vastxmlparser.xmlmodels.Linear linear) {
        Linear = linear;
    }
}
