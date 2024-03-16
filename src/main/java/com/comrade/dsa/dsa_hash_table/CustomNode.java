package com.comrade.dsa.dsa_hash_table;

public class CustomNode {
    private String key;
    private String value;
    private CustomNode nextNode;

    public CustomNode() {
    }

    public CustomNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(CustomNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "{" +
                "key:'" + key + '\'' +
                ", value:'" + value + '\'' +
                ", nextNode:" + nextNode +
                '}';
    }
}
