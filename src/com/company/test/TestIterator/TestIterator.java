package com.company.test.TestIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);//удаляем этот элемент
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator=list.iterator();
        int x =0;
        while (iterator.hasNext()){
            System.out.println(iterator.next());//особенность иттераторора, что он указывает на место перед первы элементом
            //а в дальнейшем идет по списку или массиву _____итератор____[1,2,3]
            if (x ==1){
                iterator.remove(); //не принимает на вход элементов!!!! можем удалить только текущий элемент!!!!

            }

            x++;
        }
        System.out.println(list);//отличие от foreach в том, что мы можем удалять элемент проходя по нем!!!


    }

}
