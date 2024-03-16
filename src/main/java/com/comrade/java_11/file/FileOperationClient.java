package com.comrade.java_11.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationClient {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("Shiva.txt");
        Files.writeString(path,"Welcome");
    }
}
