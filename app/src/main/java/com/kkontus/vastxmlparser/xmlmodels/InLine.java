package com.kkontus.vastxmlparser.xmlmodels;

public class InLine {
    private String AdSystem;
    private String AdTitle;
    private String Error;
    private Creatives Creatives;

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

    public com.kkontus.vastxmlparser.xmlmodels.Creatives getCreatives() {
        return Creatives;
    }

    public void setCreatives(com.kkontus.vastxmlparser.xmlmodels.Creatives creatives) {
        Creatives = creatives;
    }
}
