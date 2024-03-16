package com.comrade.java_12.files.mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMisMatchClient {
    public static void main(String[] args) throws IOException {
        Path pathOne = Files.createTempFile("shiva1",".txt");
        Path pathTwo = Files.createTempFile("shiva2",".txt");
        Files.writeString(pathOne,"Be brave");
        Files.writeString(pathTwo,"Be brave");
        long misMatchCount = Files.mismatch(pathOne,pathTwo);
        System.out.printf(" Mismatch count %d%n",misMatchCount);
        pathOne.toFile().deleteOnExit();
        pathTwo.toFile().deleteOnExit();
    }
}
