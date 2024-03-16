package com.comrade.java_11.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServerClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient=HttpClient.newBuilder().build();
        HttpRequest httpRequest=HttpRequest.newBuilder()
                                           .GET()
                                           .uri(URI.create("https://jsonplaceholder.typicode.com/todos"))
                                           .build();
       HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
       System.out.println(httpResponse.body());
       System.out.println(httpResponse.statusCode());
       HttpHeaders httpHeaders = httpResponse.headers();
       httpHeaders.map().forEach((key,value)->{
           System.out.println(key+"="+value);
       });
       System.out.println(httpResponse.headers());

    }
}
