package com.company.kontrolTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RatingStudent {


    public static void main(String[] args) {
        List<Student> studList=new ArrayList<>();


        int countStudent=0;

        Scanner scanner=new Scanner(System.in);
        String lastName=null;
        while (studList.size() < 1) {
            System.out.println("ФИО");

            while (!( lastName=scanner.nextLine() ).isEmpty()) {
                List<Integer> markList;
                Student student;
                studList.add(student=new Student(lastName, markList=new ArrayList<>()));

                for (int i=0; i < 5; i++) {
                    System.out.println("оценки студента");
                    int mark=scanner.nextInt();
                    if (mark == 0) {
                        break;
                    }
                    if (mark > 5 || mark < 2) {
                        throw new IllegalArgumentException("Вы ввели неправильную оценку от 3 до 5");
                    }

                    markList.add(mark);
                }


            }

        }


        for (Student stud : studList) {
            int countMark3=0;
            int countMark4=0;
            int countMark5=0;
            for (Integer marks : stud.getMarkList()) {
                if (marks == 5) {
                    countMark5++;

                } else if (marks == 4) {
                    countMark4++;
                } else if (marks == 3) {
                    countMark3++;
                }
            }


            if (( countMark5 == 5 || countMark5 == 4 || countMark5 == 3 ) && countMark3 == 0 && countMark4 == 0) {
                stud.setStipendium(4000);
            } else if (( countMark4 == 5 || countMark4 == 4 || countMark4 == 3 ) && countMark5 > 0 && countMark3 == 0) {
                stud.setStipendium(3000);

            } else if (( countMark4 == 5 || countMark4 == 4 || countMark4 == 3 ) && countMark3 == 0 && countMark5 == 0) {
                stud.setStipendium(2500);

            } else if (countMark3 >= 2) {
                stud.setStipendium(0);


            } else stud.setStipendium(2000);


        }

        for (Student studen : studList
                )

        {
            System.out.println(studen);
        }
    }


}



