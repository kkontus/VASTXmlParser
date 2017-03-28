package com.kkontus.vastxmlparser.xmlmodels;

import com.google.gson.annotations.SerializedName;

public class Linear {
    @SerializedName("@skipoffset")
    private String skipoffset;
    private String Duration;
    private TrackingEvents TrackingEvents;
    private VideoClicks VideoClicks;
    private MediaFiles MediaFiles;
    private String AdParameters;
    private CreativeExtensions CreativeExtensions;
    private Icons Icons;

    public Icons getIcons() {
        return Icons;
    }

    public void setIcons(Icons icons) {
        Icons = icons;
    }

    public CreativeExtensions getCreativeExtensions() {
        return CreativeExtensions;
    }

    public void setCreativeExtensions(CreativeExtensions creativeExtensions) {
        CreativeExtensions = creativeExtensions;
    }

    public String getAdParameters() {
        return AdParameters;
    }

    public void setAdParameters(String adParameters) {
        AdParameters = adParameters;
    }

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

    public TrackingEvents getTrackingEvents() {
        return TrackingEvents;
    }

    public void setTrackingEvents(TrackingEvents trackingEvents) {
        TrackingEvents = trackingEvents;
    }

    public VideoClicks getVideoClicks() {
        return VideoClicks;
    }

    public void setVideoClicks(VideoClicks videoClicks) {
        VideoClicks = videoClicks;
    }

    public MediaFiles getMediaFiles() {
        return MediaFiles;
    }

    public void setMediaFiles(MediaFiles mediaFiles) {
        MediaFiles = mediaFiles;
    }
}
