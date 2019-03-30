package com.company.workWithFileAndDirectory;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChannelNioBuffer {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("/Users/macuser/Desktop/projects/Alevel/Hellow");
        String nameFile=( "/Users/macuser/Desktop/projects/Alevel/Hellow" );
        nioReaderWithChannel(nameFile);
    }

    public static void nioReaderWithChannel(String nameFile) throws IOException {
        try (RandomAccessFile file=new RandomAccessFile(nameFile, "rw");
            FileChannel channel=file.getChannel()){

            ByteBuffer buffer=ByteBuffer.allocate(128);
            int countByte=channel.read(buffer);

            while (countByte > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println( (char) buffer.get());

                }
                buffer.clear();
                countByte = channel.read(buffer);
            }
        }


    }
}

