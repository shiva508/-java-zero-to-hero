package com.pool.bytearrayoutputstream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamClient {
    public static void main(String[] args) {
        createByteArrayOutputStream();
        
    }

    private static void createByteArrayOutputStream() {
        // Using Default size(32)
        ByteArrayOutputStream defaultSizeBaos = new ByteArrayOutputStream();
        // Defining custom size
        ByteArrayOutputStream customSize = new ByteArrayOutputStream(10);
    }
}
