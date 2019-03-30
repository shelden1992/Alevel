package com.company.workWithFileAndDirectory;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReaderFileNio {
    public static void main(String[] args) throws IOException {

        Path path=Paths.get("/Users/macuser/Desktop/projects/Alevel/Hellow");
        Path path1=Paths.get("/Users/macuser/Desktop/projects/Alevel/Hellow1");
        List<String> list=Files.readAllLines(path);
        for (String i : list
                ) {
//            System.out.println(i);

        }
//        System.out.println(list.get(0) + "\n" + list.get(1));

        nioReadFileWithBuffer(path);
        nioReadWithStream(path1);
    }

    public static void nioReadFileWithBuffer(Path path) throws IOException {
        Charset charset=Charset.forName("UTF-8");
        try (BufferedReader reader=Files.newBufferedReader(path, charset)) {
            String s;
            while (( s=reader.readLine() ) != null) {
                System.out.println(s);
            }
        }

    }

    public static void nioReadWithStream(Path path) throws IOException {
        try (InputStream inputStream=Files.newInputStream(path)) {
            String s;
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            while (( s=reader.readLine() ) != null) {
                System.out.println(s);
            }

        }
    }

    public static void nioReaderWithChannel(String nameFile) throws IOException {
        try (RandomAccessFile file=new RandomAccessFile(nameFile, "rw");
             FileChannel channel=file.getChannel()) {

            ByteBuffer buffer=ByteBuffer.allocate(128);
            int countByte=channel.read(buffer);//read, а в буффер записываешь

            while (countByte > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());

                }
                buffer.clear();
                countByte=channel.read(buffer);
            }
        }

    }
}

