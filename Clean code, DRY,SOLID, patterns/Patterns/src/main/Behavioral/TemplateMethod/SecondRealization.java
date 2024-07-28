package org.example.Behavioral.TemplateMethod;

public class SecondRealization extends TemplateMethod {
    @Override
    void printSecondLine() {
        System.out.println("SecondRealization print second line");
    }

    @Override
    void printFourthLine() {
        System.out.println("SecondRealization print fourth line");
    }
}
