package com.company.workWithFileAndDirectory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriterFileNio {
    public static void main(String[] args) throws IOException {
//        Path path=Paths.get("/Users/macuser/Desktop/projects/Alevel/Hellow");
//        nioWriteWithBuffer(path);
//        nioWriteWithStream(path);
        String s="/Users/macuser/Desktop/projects/Alevel/Hellow1";
//        nioWriteWithChannel(s);
        nioWriteWithRandomAccess(s);
    }

    public static void nioWriteWithBuffer(Path path) throws IOException {
        Charset charset=Charset.forName("UTF-8");
        String s="HELLOW";
        try (BufferedWriter bufferedWriter=Files.newBufferedWriter(path)) {
            bufferedWriter.write(s, 0, 4);
        }
    }

    public static void nioWriteWithStream(Path path) throws IOException {

        try (OutputStream outputStream=Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String s="HELLOW";
            byte[] byts=s.getBytes();
            outputStream.write(byts, 0, byts.length);
        }
    }

    public static void nioWriteWithChannel(String s) throws IOException {

        try (RandomAccessFile file=new RandomAccessFile(s, "rw");
             FileChannel channel=file.getChannel()) {
            String writeToFike="Hi^My^Dear^Friend!";
            byte[] bytes=writeToFike.getBytes();
            ByteBuffer buffer=ByteBuffer.wrap(bytes);//(s.getBytes().length)значение int котороя указывает длину байтмассива переданной стороки
            //когда вызываем метод wrap - оборачивает байт.array в буфер; устанавливает знаение position -0!!!! capacity = размеру нашего массива
            channel.write(buffer);
        }


    }

    public static void nioWriteWithRandomAccess(String s) throws IOException {
        ByteBuffer mark=ByteBuffer.wrap(" MARKED AREA ".getBytes());
        ByteBuffer buffer=ByteBuffer.allocate(100);
        Path path=Paths.get(s);

        try (FileChannel openFile=FileChannel.open(path, StandardOpenOption.READ, StandardOpenOption.WRITE)) {

            int countByte=0;
            while (buffer.hasRemaining() && countByte != -1) {
                countByte=openFile.read(buffer);


            }
            openFile.position(0);
            openFile.write(buffer);
            buffer.rewind();
            openFile.position(openFile.size() / 2);
            openFile.write(mark);
            buffer.rewind();
            buffer.flip();
            openFile.position(openFile.size() - 1);
            openFile.write(buffer);


        }

    }


}
