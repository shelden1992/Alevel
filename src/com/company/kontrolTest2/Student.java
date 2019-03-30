package com.company.kontrolTest2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> markList= new ArrayList<>();
    private int Stipendium;
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark=mark;
    }

    public Student(String name, List<Integer> markList) {
        this.name=name;
        this.markList=markList;
    }

    public int getStipendium() {
        return Stipendium;
    }

    public void setStipendium(int stipendium) {
        Stipendium=stipendium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Integer> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Integer> markList) {
        this.markList=markList;
    }

    @Override
    public String toString() {
        return "Student:" +
                "ФИО студента: '" + name + '\'' +
                ", оценки=" + markList + "стипендия=" + getStipendium();
    }
}
