package com.company.test.TestTryCatch;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {


    public static void main(String[] args) {
      Date testDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");//спросить по поводу перестановки дат
        String str = args.length == 0 ? "31.12.2018" : args[0];//НЕ ПОНИМЮЮЮЮЮ

        System.out.print("Строка " + str + " распаршена как ");
//        Date parsingDate;
        try {
//            simpleDateFormat.applyPattern("dd.MM.yyyy");
            Date docDate= simpleDateFormat.parse(str);
            System.out.println(docDate);
        }catch (Exception e) {
            System.out.println("Нераспаршена с помощью " + testDate);
        }
    }

//        System.out.println(simpleDateFormat.format(testDate));
//        System.out.printf("%tc", testDate);
//        System.out.printf( "%s %te %<tB %<=tY", testDate);
//       System.out.printf(String.valueOf(testDate));
    }
