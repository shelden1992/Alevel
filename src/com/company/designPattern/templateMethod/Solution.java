package com.company.designPattern.templateMethod;


/**Когда использовать шаблонный метод?
 когда наследники наслед примерно один и тот же функционал, можно воспользоваться данным паттерном,
 смысл создать не абстрактный метод, который не будет оверрайдется, и туда запихнуть абстр методы, которые нам надо (которые у
 подклассах одинаковые)!!
 *
 *
 Когда планируется, что в будущем подклассы должны будут переопределять различные этапы алгоритма без изменения его структуры

 Когда в классах, реализующим схожий алгоритм, происходит дублирование кода.
 Вынесение общего кода в шаблонный метод уменьшит его дублирование в подклассах.

 */


public class Solution {
    public static void main(String[] args) {
        new School().learning();
        new University().learning();

    }


}