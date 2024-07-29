package org.example.Behavioral.Visitor.Visitor.Visitors;


import org.example.Behavioral.Visitor.Visitor.Elements.Cat;
import org.example.Behavioral.Visitor.Visitor.Elements.Dog;

/*
* Каждая реализация инкапсулирует функционал всех типов
* (т.е. описывает 1 метод их интерфейса для каждой реализации
* с помощью перегрузки метода)
*/
public interface Visitor {

    void visitCat(Cat animal);

    void visitDog(Dog animal);

}
//добавится новый метод, если в Element появится новый тип
// void visit***(AnimalType animal);

//Добавится новый класс Visitor, если у Element появится новый функционал
