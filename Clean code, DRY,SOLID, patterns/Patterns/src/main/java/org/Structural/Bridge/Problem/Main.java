package org.example.Structural.Bridge.Problem;

import org.example.Structural.Bridge.Problem.Colors.Black;
import org.example.Structural.Bridge.Problem.Pieces.BlackQueen;
/*
* Такая же идея иерархии классов, но без паттерна мост
* приводит к структуре из 8 классов, при расширении иерархии кол-во классов
* будет расти в геометрической прогрессии
* (плюс невозможно абстрагироваться при создании объектов)
*/
public class Main {

    public static void main(String[] args) {
        BlackQueen blackQueen = new BlackQueen(new Black());
        blackQueen.printPiece();
    }
}
