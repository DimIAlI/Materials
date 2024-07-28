package org.example.Behavioral.TemplateMethod;

abstract class TemplateMethod {
    /*Метод определен как финальный
     * для невозможности изменения шагов выполнения алгоритма
     */
    final void print() {
        printFirstLine();
        printSecondLine();
        printThirdLine();
        printFourthLine();
    }

    void printFirstLine() {
        System.out.println("First line");
    }

    abstract void printSecondLine();

    void printThirdLine() {
        System.out.println("Third line");
    }

    abstract void printFourthLine();
}
