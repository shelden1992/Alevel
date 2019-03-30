package com.company.designPattern.decorator;

public abstract class Decorator extends Component {
    //    собственно декоратор, реализуется в виде абстрактного класса и имеет тот же базовый класс,
//    что и декорируемые объекты.
//    Поэтому базовый класс Component должен быть по возможности легким и определять только базовый интерфейс.
//    (someWork)
    private Component component;
    //Класс декоратора также хранит ссылку на декорируемый объект в виде объекта базового класса Component
    // и реализует связь с базовым классом как через наследование, так и через отношение агрегации.


    @Override
    public void someWork() {
if (component!= null){
    component.someWork();
}
    }

    public void setComponent(Component component) {
        this.component=component;
    }

}
