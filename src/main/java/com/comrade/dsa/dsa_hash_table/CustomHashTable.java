package com.comrade.dsa.dsa_hash_table;

import java.util.Arrays;
import java.util.List;

public class CustomHashTable {
    private final int INITIAL_CAPACITY=4;
    private CustomNode[] customNodes;

    public CustomHashTable() {
        this.customNodes=new CustomNode[INITIAL_CAPACITY];
    }

    public void put(String key,String value){

        int hashValue=this.hashGenerator(key);
        CustomNode newNode=new CustomNode(key,value);
        if (null==customNodes[hashValue]){
            customNodes[hashValue]=newNode;
        }else {
            CustomNode currentCustomNode = customNodes[hashValue];
            if (currentCustomNode.getValue().equals(value)){
                currentCustomNode.setValue(value);
            }else {
                while (null !=currentCustomNode){
                    if (currentCustomNode.getNextNode() == null) {
                        currentCustomNode.setNextNode(newNode);
                        currentCustomNode=null;
                    }else {
                        currentCustomNode=currentCustomNode.getNextNode();
                    }
                }
            }
        }
    }

    public String getByKey(String key){
        String value=null;
        int hashValue=this.hashGenerator(key);
        if (customNodes[hashValue] != null) {
            CustomNode customNode = customNodes[hashValue];
            boolean valueFound=false;
            while (!valueFound && null !=customNode){
                String currentValue=customNode.getValue();
                String currentKey=customNode.getKey();
                if (currentKey != null && currentKey.equals(key)) {
                    valueFound=true;
                    value=currentValue;
                }else {
                    customNode=customNode.getNextNode();
                }
            }
        }
        return value;
    }

    public String getByValue(String inputValue) {
        String value = null;
        for (int i = 0; i < customNodes.length; i++) {
            if (customNodes[i] != null) {
            CustomNode customNode = customNodes[i];
                if (customNode != null) {
                    String currentValue=customNode.getValue();
                    String currentKey=customNode.getKey();

                }
            }
        }
        return value;
    }
    private int hashGenerator(String key){
        return Math.abs(key.hashCode()%INITIAL_CAPACITY);
    }

    public List<CustomNode> getCustomNodes(){
        return Arrays.asList(customNodes);
    }
}
