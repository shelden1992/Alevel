package com.company.hometaskArrayList;

public interface Home<E> extends Iterable<E> {
    int size();

    boolean add(E e);

    void update(int index, E e);

    E get(int index);

    void delet(int index);

//      void growArray();
}