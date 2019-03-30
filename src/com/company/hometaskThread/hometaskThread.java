package com.company.hometaskThread;

import java.io.*;

public class hometaskThread {


    public static StringBuilder input=new StringBuilder();

    static String str;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {

            ReaderInInput readerIn=new ReaderInInput();
            Thread readerInInput=new Thread(readerIn);
            int count=0;

            System.out.println("Введите строки");

            while (true) {
                str=reader.readLine();
                if (str.equals("quit")) {
                    readerIn.setFlag(true);
                    break;
                }


                if (!( input.toString().equals(str) )) {
                    input.append(str);
                }

                if (count == 0) {
                    readerInInput.start();
                }
                count++;

            }


        }
    }
}

class ReaderInInput implements Runnable {
    public boolean flag=false;

    public synchronized void setFlag(boolean flag) {
        this.flag=flag;
    }

    @Override
    public void run() {
        while (!flag) {
            try {
                Thread.sleep(1000);
                writerStringToFile(hometaskThread.input, hometaskThread.str);


            } catch (InterruptedException | IOException e) {
                e.printStackTrace();

            }
        }
    }

    private void writerStringToFile(StringBuilder input, String str) throws IOException {


        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("output.txt"))) {


            bufferedWriter.write(String.valueOf(input));
//            System.out.println(input);
        }
    }
}





