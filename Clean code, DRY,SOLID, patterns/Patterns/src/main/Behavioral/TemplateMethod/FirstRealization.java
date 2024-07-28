package org.example.Behavioral.TemplateMethod;

public class FirstRealization extends TemplateMethod {

    @Override
    void printSecondLine() {
        System.out.println("FirstRealization print second line");
    }

    @Override
    void printFourthLine() {
        System.out.println("FirstRealization print fourth line");
    }
}
