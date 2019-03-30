package com.company.hometaskArrayList;

import java.util.Iterator;

public class PetHomeList<E> implements Home<E> {
    private E[] array;


    public PetHomeList() {
        array=(E[]) new Object[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean add(E e) {

        try {
            E[] temp=array;//принял все элементы
            array=(E[]) new Object[temp.length + 1];//array пустой, нужно
            System.arraycopy(temp, 0, array, 0, temp.length);//1. откуда 2.с какого элемента 3.куда копировать
            //4.с какого элементе начнет копия 5.сколько всего скопировать элементов
            array[array.length - 1]=e;//последний элемент, который равняется 0, и присваеив значение е!!!
            return true;

        } catch (ClassCastException exep) {//так как произвели downcast
            exep.getStackTrace();

        }
        return false;

    }

    @Override
    public void update(int index, E e) {
        array[index]=e;

    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public void delet(int index) {
        E[] temp=array;
        array=(E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, array, 0, index);
        int CountElemenAfterIndex=temp.length - index - 1;
        System.arraycopy(temp, index + 1, array, index, CountElemenAfterIndex);


    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
