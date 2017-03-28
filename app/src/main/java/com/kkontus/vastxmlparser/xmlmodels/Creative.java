package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Creative {
    @SerializedName("@sequence")
    private String sequence;
    @SerializedName("@id")
    private String id;
    @SerializedName("Linear")
    private List<Linear> Linear;

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

    public List<Linear> getLinear() {
        return Linear;
    }

    public void setLinear(List<Linear> linear) {
        Linear = linear;
    }
}
