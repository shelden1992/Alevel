package com.company.reflexia;

import java.lang.reflect.*;
import java.util.Calendar;

public class Reflexia {
    private  static transient int i =100;
    String s;

    public Reflexia(String s) {
        this.s=s;
    }
    public String someMethod (String s){
        return "Guys";
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Reflexia reflexia = new Reflexia("Name");
        Class clazz = Reflexia.class;
//        Class clazz2 =  Reflexia.getClass();
//        Class clazz3 =Class.forName("com.company.reflexia");
//        Reflexia reflexia1 =(Reflexia) clazz.newInstance();//экзепляр класса с помощью рефлексии

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor: constructors ){
            System.out.println(constructor.getName()); //name constructor
            Parameter [] parameters = constructor.getParameters();//все парамаетры, которые есть в кнострукторе сохран в массиве
            for (Parameter paramet: parameters){ // пройтися по массиву и параметры записываются типо arg0, arg1 и т.д
            System.out.println(paramet.getName());}
        }
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            System.out.println(method.getName());
            Parameter [] parameters = method.getParameters();
            for (Parameter paramet: parameters){
                System.out.println(paramet.getName());}
            System.out.println( Modifier.toString(method.getModifiers())); //Modifier -- получить модифакацию методов

        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields
             ) {
            System.out.println(field. getName());
            System.out.println(field.getType(). getName());

            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true);                      //    ||
            System.out.println(field.getInt(reflexia));    //
            field.setInt(reflexia, 11);                 //даже можно поменять приватное поле
            System.out.println(field.getInt(reflexia));

        }


    }
}
