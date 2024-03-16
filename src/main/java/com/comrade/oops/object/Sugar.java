package com.comrade.oops.object;

public class Sugar {
    private Integer noOfTeaSpoons;

    public Sugar(Integer noOfTeaSpoons) {
        this.noOfTeaSpoons = noOfTeaSpoons;
    }

    public Integer getNoOfTeaSpoons() {
        return noOfTeaSpoons;
    }

    public void setNoOfTeaSpoons(Integer noOfTeaSpoons) {
        this.noOfTeaSpoons = noOfTeaSpoons;
    }

    @Override
    public String toString() {
        return "Sugar [noOfTeaSpoons=" + noOfTeaSpoons + "]";
    }
}
