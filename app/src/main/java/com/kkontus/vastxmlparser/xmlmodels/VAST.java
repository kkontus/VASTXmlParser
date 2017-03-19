package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class VAST {
    @SerializedName("@version")
    private String version;
    private Ad Ad;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public com.kkontus.vastxmlparser.xmlmodels.Ad getAd() {
        return Ad;
    }

    public void setAd(com.kkontus.vastxmlparser.xmlmodels.Ad ad) {
        Ad = ad;
    }
}
