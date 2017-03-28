package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Creatives {
    @SerializedName("Creative")
    private List<Creative> Creative;

    public List<Creative> getCreative() {
        return Creative;
    }

    public void setCreative(List<Creative> creative) {
        Creative = creative;
    }
}
