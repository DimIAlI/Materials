package org.example.Structural.Bridge.Bridge;

import org.example.Structural.Bridge.Bridge.Colors.White;
import org.example.Structural.Bridge.Bridge.Pieces.Piece;
import org.example.Structural.Bridge.Bridge.Pieces.Queen;
/*
* При добавлении нового класса фигуры в иерархию классов добавится только один класс
* Структура классов состоит из 6-ти классов
*/
public class Main {

    public static void main(String[] args) {
        Piece blackKing = new Queen(new White());
        blackKing.printPiece();
    }
}
