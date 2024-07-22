package org.example.Creational.Prototype.Shallow;
/*
 * Пример поверхностного клонирования с использованием Cloneable
 */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("NY");
        Person person = new Person("Mike", 28, address);

        Person personClone = person.clone();
        System.out.println(personClone);

        boolean areAdressesEquials = person.equals(personClone);
        System.out.println(areAdressesEquials);
    }
}
