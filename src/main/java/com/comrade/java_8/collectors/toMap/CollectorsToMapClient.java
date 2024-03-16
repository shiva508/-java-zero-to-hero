package com.comrade.java_8.collectors.toMap;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapClient {
    public static void main(String[] args) {
        List<CallMetaData> callMetaDataOne =new ArrayList<>();
        callMetaDataOne.add(new CallMetaData(2,1234,"mp4"));
        callMetaDataOne.add(new CallMetaData(3,5000,"mp4"));
        callMetaDataOne.add(new CallMetaData(1,123,"mp4"));
        AtomicLong atomicLong = new AtomicLong(0l);
        callMetaDataOne=callMetaDataOne.stream().sorted(Comparator.comparingInt(CallMetaData::getId)).peek(callMetaData -> {
            if (atomicLong.get()==0l){
                callMetaData.setStartRange(0l);
                atomicLong.getAndAdd(callMetaData.getMediaSize());
            }else {
                callMetaData.setStartRange(atomicLong.getAndAdd(callMetaData.getMediaSize())+1l);
            }
            callMetaData.setEndRange(atomicLong.get());
        }).collect(Collectors.toList());
        System.out.println(callMetaDataOne);
        List<CallMetaData> callMetaDataTwo =new ArrayList<>();
        callMetaDataTwo.add(new CallMetaData(1,1234,"mp4"));
        callMetaDataTwo.add(new CallMetaData(2,123,"mp4"));

        List<CallMetaData> callMetaDataThree =new ArrayList<>();
        callMetaDataThree.add(new CallMetaData(2,1234,"mp4"));
        callMetaDataThree.add(new CallMetaData(1,123,"mp4"));
        List<CallInfo> callInfos = Arrays.asList(new CallInfo("b",new Date(System.currentTimeMillis()-100000000),callMetaDataOne),
                                                 new CallInfo("c",new Date(System.currentTimeMillis()+1000000),callMetaDataTwo),
                                                 new CallInfo("a",new Date(System.currentTimeMillis()+10000),callMetaDataThree));
        Map<String, CallInfo> collect = callInfos.stream()
                .sorted(Comparator.comparing(CallInfo::getCreatedDate))
                .collect(Collectors.toMap(CallInfo::getLegId, Function.identity(), (key, key1) -> key, LinkedHashMap::new));
        System.out.println(collect);
    }


}
