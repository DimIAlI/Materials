package org.example.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie cookie = new Cookie();

        Cookie clone = cookie.clone();
        System.out.println(clone);
    }
}
