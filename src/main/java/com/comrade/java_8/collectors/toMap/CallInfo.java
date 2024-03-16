package com.comrade.java_8.collectors.toMap;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CallInfo implements Serializable {
    String legId;
    Date createdDate;
    List<CallMetaData> callMetaData;

    public CallInfo(String legId, Date createdDate, List<CallMetaData> callMetaData) {
        this.legId = legId;
        this.createdDate = createdDate;
        this.callMetaData = callMetaData;
    }

    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<CallMetaData> getCallMetaData() {
        return callMetaData;
    }

    public void setCallMetaData(List<CallMetaData> callMetaData) {
        this.callMetaData = callMetaData;
    }

    @Override
    public String toString() {
        return "CallInfo{" +
                "legId='" + legId + '\'' +
                ", createdDate=" + createdDate +
                ", callMetaData=" + callMetaData +
                '}';
    }
}
