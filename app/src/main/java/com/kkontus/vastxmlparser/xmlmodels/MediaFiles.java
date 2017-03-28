package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaFiles {
    @SerializedName("MediaFile")
    private List<MediaFile> MediaFile;

    public List<MediaFile> getMediaFile() {
        return MediaFile;
    }

    public void setMediaFile(List<MediaFile> mediaFile) {
        MediaFile = mediaFile;
    }
}
