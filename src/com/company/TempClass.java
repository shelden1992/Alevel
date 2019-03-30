package com.company;

import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempClass {
   static Path p =Paths.get("/Users/macuser/Desktop/projects/Alevel/src/com/company/log.properties");

    public static void main(String[] args) {
        try {
            Stream<String> stream =Files.lines(p);
            System.out.println(stream.collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }











    }

