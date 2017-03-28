package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InLine {
    private String AdSystem;
    private String AdTitle;
    private String Error;
    private Creatives Creatives;
    private String Description;
    private String Advertiser;
    private String Pricing;
    private String Survey;
    @SerializedName("Impression")
    private List<String> Impression;
    private Extensions Extensions;

    public String getAdSystem() {
        return AdSystem;
    }

    public void setAdSystem(String adSystem) {
        AdSystem = adSystem;
    }

    public String getAdTitle() {
        return AdTitle;
    }

    public void setAdTitle(String adTitle) {
        AdTitle = adTitle;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public Creatives getCreatives() {
        return Creatives;
    }

    public void setCreatives(Creatives creatives) {
        Creatives = creatives;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAdvertiser() {
        return Advertiser;
    }

    public void setAdvertiser(String advertiser) {
        Advertiser = advertiser;
    }

    public String getPricing() {
        return Pricing;
    }

    public void setPricing(String pricing) {
        Pricing = pricing;
    }

    public String getSurvey() {
        return Survey;
    }

    public void setSurvey(String survey) {
        Survey = survey;
    }

    public List<String> getImpression() {
        return Impression;
    }

    public void setImpression(List<String> impression) {
        Impression = impression;
    }

    public Extensions getExtensions() {
        return Extensions;
    }

    public void setExtensions(Extensions extensions) {
        Extensions = extensions;
    }
}
