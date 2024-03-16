package com.comrade.java_8.collectors.toMap;

public class CallMetaData {
    private Integer id;
    private long mediaSize;
    private String mediaType;
    private long startRange;
    private long endRange;

    public CallMetaData(Integer id, long mediaSize, String mediaType) {
        this.mediaSize = mediaSize;
        this.mediaType = mediaType;
        this.id = id;
    }

    public long getMediaSize() {
        return mediaSize;
    }

    public void setMediaSize(long mediaSize) {
        this.mediaSize = mediaSize;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public long getStartRange() {
        return startRange;
    }

    public void setStartRange(long startRange) {
        this.startRange = startRange;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getEndRange() {
        return endRange;
    }

    public void setEndRange(long endRange) {
        this.endRange = endRange;
    }

    @Override
    public String toString() {
        return "CallMetaData{" +
                "id=" + id +
                ", mediaSize=" + mediaSize +
                ", mediaType='" + mediaType + '\'' +
                ", startRange=" + startRange +
                ", endRange=" + endRange +
                '}';
    }
}
