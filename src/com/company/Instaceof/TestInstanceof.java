package com.company.Instaceof;

public class TestInstanceof {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        if (o instanceof Cat) {
            return "Кот";
        }

        if (o instanceof Tiger) {//Animal-->Cat-->Tiger
            return "Тигр";
        }
        if (o instanceof Lion) {
            return "Лев";
        }
        if (o instanceof Bull) {
            return "Бык";

        }
        if (o instanceof Cow) {
            return "Корова";

        }


        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

//трассируя код), любой тип который имеет родителя, наследует все типы по родительскому дереву.
// И при сравнении идет перебор от самого "глубокого" до самого "поверхностного" типа.
// И в переменную выносится верхний правильный (из дерева).
//
//Animal -> Cat -> Tiger
//
//так к примеру для тигра: сначала код воспринимает аргумент метода как животное,
// потом как кошку и только потом как тигр ( соответственно на каждом этапе переприсваивая значение sss).
// последнее значение и остается для возврата.
/////////////////////////
//Задачу решил, поставив тигра и льва в начало метода, но все равно остается вопрос по поводу работы команды instanceof.
// Получается, что он проверяет принадлежность не только к тому классу, который я указываю но и чекает его родителей?
// Если так, то будет ли этот класс проверять те классы, которые стоят выше родительского.
// Например, было бы так: Живое существо -> животное -> кошка -> лев.
// Если я напишу условие для Живого существа и пропущу через него льва, то лев определиться как живое существо, верно?
//лев instanceof живое существо вернет true
//живое существо instanceof лев - false