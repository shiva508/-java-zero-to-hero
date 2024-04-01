package com.comrade.io_streams.file.read_write_chunk;

import java.io.*;

public class FileReadWriteChunkClient {
    public static final int BUFFER_SIZE = 2;
    public static void main(String[] args) {

        try(InputStream inputStream = new ByteArrayInputStream("Welcome \n Hi \n what".getBytes());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            OutputStream outputStream = new FileOutputStream("TEST.txt");) {
            byte [] buffer = new byte[BUFFER_SIZE];
            int readLine;
            while ((readLine = bufferedInputStream.read(buffer,0,buffer.length)) !=-1){
                outputStream.write(buffer,0,readLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
