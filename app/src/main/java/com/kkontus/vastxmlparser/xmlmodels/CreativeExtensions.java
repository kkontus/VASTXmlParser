package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CreativeExtensions {
    @SerializedName("CreativeExtension")
    private List<CreativeExtension> CreativeExtension;

    public List<CreativeExtension> getCreativeExtension() {
        return CreativeExtension;
    }

    public void setCreativeExtension(List<CreativeExtension> creativeExtension) {
        CreativeExtension = creativeExtension;
    }
}
