package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VAST {
    @SerializedName("@version")
    private String version;
    @SerializedName("Ad")
    private List<Ad> Ad;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Ad> getAd() {
        return Ad;
    }

    public void setAd(List<Ad> ad) {
        Ad = ad;
    }
}
