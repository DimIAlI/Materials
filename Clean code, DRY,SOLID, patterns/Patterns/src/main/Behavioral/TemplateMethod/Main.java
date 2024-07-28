package org.example.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        TemplateMethod method = new FirstRealization();
        method.print();
        System.out.println("\n");
        TemplateMethod method2 = new SecondRealization();
        method2.print();
    }
}
