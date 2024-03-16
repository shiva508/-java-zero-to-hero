package com.comrade.oops.object;

public class Tea implements Cloneable {

    private String teaType;
    private Double rate;
    private Sugar sugar;

    public Tea(String teaType, Double rate, Sugar sugar) {
        super();
        this.teaType = teaType;
        this.rate = rate;
        this.sugar = sugar;
    }

    public Tea(String teaType, Double rate) {
        this.teaType = teaType;
        this.rate = rate;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Tea [teaType=" + teaType + ", rate=" + rate + ", sugar=" + sugar + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Tea clonedTea = (Tea) super.clone();
        Sugar copiedSuger = new Sugar(clonedTea.getSugar().getNoOfTeaSpoons());
        clonedTea.setSugar(copiedSuger);
        return clonedTea;
    }
}
