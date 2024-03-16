//package com.pool.hashtablehashmap;
//
//import org.openjdk.jmh.annotations.Benchmark;
//import org.openjdk.jmh.annotations.Group;
//import org.openjdk.jmh.infra.Blackhole;
//
//import java.util.concurrent.ConcurrentHashMap;
//
//public class ConcurrentHashMapClient {
//    ConcurrentHashMap<String,String> hashMap=new ConcurrentHashMap<>();
//    public static void main(String[] args) {
//       /* ConcurrentHashMap<String,String> hashMap=new ConcurrentHashMap<>();
//        hashMap.put("Shiva","Dasari");
//        hashMap.put("Satish","Dasari");
//        hashMap.putIfAbsent("Ravi","Dasari");
//        var name=hashMap.get("Shiva");
//        System.out.println(name);
//        ConcurrentHashMapClient concurrentHashMapClient=new ConcurrentHashMapClient();
//        concurrentHashMapClient.benchmarkHashtablePut();*/
//    }
//
//    @Benchmark
//    @Group("hashtable")
//    public void benchmarkHashtablePut() {
//        for (int i = 0; i < 10000; i++) {
//            hashMap.put(String.valueOf(i), String.valueOf(i));
//        }
//    }
//
//    @Benchmark
//    @Group("hashtable")
//    public void benchmarkHashtableGet(Blackhole blackhole) {
//        for (int i = 0; i < 10000; i++) {
//            String value = hashMap.get(String.valueOf(i));
//            blackhole.consume(value);
//        }
//    }
//}
