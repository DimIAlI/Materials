package org.example.Creational.Prototype.Deep.FinalFields;

import java.util.Objects;

public class Person implements Copyable {

    private final String name;
    private final int age;
    private final Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = new Address(other.address.getCity());
    }

    public Person copy() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.getCity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}

/*
 * C final ссылочным полем так не получится:
 *
 *  @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = address.clone();
        return person;
    }
 */
