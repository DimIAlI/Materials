package org.example.Creational.Prototype.Deep.FinalFields;

/*
 * Пример глубокого копирования с использованием финальных полей
 * и определением собственного интерфейса
 */
public class Main {

    public static void main(String[] args) {

        Address address = new Address("NY");
        Person person = new Person("Mike", 28, address);

        Person personClone = person.copy();
        System.out.println(personClone);

        boolean areAdressesEquials = person.equals(personClone);
        System.out.println(areAdressesEquials);
    }
}
