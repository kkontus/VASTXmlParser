package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Icons {
    @SerializedName("Icon")
    private List<Icon> Icon;

    public List<Icon> getIcon() {
        return Icon;
    }

    public void setIcon(List<Icon> icon) {
        Icon = icon;
    }
}
