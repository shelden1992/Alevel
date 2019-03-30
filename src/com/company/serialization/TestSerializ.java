package com.company.serialization;

import java.io.*;

public class TestSerializ implements Serializable {

    public byte version=100;
    public byte count=0;


    public static void main(String args[]) throws IOException, ClassNotFoundException {


        FileOutputStream fos=new FileOutputStream("temp.out");  //создание, темп файла, в который и будет сохранен
        // наш класс
        methodOfWriteObject(fos);

        FileInputStream fis=new FileInputStream("temp.out");
        methodOfReaderObject(fis);


    }

    private static void methodOfReaderObject(FileInputStream fis) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(fis);
        TestSerializ testSerializ=(TestSerializ) ois.readObject();
    }

    private static void methodOfWriteObject(FileOutputStream fos) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        TestSerializ ts=new TestSerializ();
        oos.writeObject(ts);
        oos.flush();
        oos.close();
    }


}

