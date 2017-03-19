package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Linear {
    @SerializedName("@skipoffset")
    private String skipoffset;
    private String Duration;
    private TrackingEvents TrackingEvents;
    private VideoClicks VideoClicks;
    private MediaFiles MediaFiles;

    public String getSkipoffset() {
        return skipoffset;
    }

    public void setSkipoffset(String skipoffset) {
        this.skipoffset = skipoffset;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public com.kkontus.vastxmlparser.xmlmodels.TrackingEvents getTrackingEvents() {
        return TrackingEvents;
    }

    public void setTrackingEvents(com.kkontus.vastxmlparser.xmlmodels.TrackingEvents trackingEvents) {
        TrackingEvents = trackingEvents;
    }

    public com.kkontus.vastxmlparser.xmlmodels.VideoClicks getVideoClicks() {
        return VideoClicks;
    }

    public void setVideoClicks(com.kkontus.vastxmlparser.xmlmodels.VideoClicks videoClicks) {
        VideoClicks = videoClicks;
    }

    public com.kkontus.vastxmlparser.xmlmodels.MediaFiles getMediaFiles() {
        return MediaFiles;
    }

    public void setMediaFiles(com.kkontus.vastxmlparser.xmlmodels.MediaFiles mediaFiles) {
        MediaFiles = mediaFiles;
    }
}
