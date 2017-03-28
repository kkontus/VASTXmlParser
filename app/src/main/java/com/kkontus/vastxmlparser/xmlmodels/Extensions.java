package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Extensions {
    @SerializedName("Extension")
    private List<Extension> Extension;

    public List<Extension> getExtension() {
        return Extension;
    }

    public void setExtension(List<Extension> extension) {
        Extension = extension;
    }
}
