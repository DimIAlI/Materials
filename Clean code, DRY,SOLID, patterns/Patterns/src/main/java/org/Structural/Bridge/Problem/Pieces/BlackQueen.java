package org.example.Structural.Bridge.Problem.Pieces;

import org.example.Structural.Bridge.Problem.Colors.Black;
import org.example.Structural.Bridge.Problem.Colors.Color;

public class BlackQueen extends Queen implements Color {

    Black black;

    public BlackQueen(Black black) {
        this.black = black;
    }

    @Override
    public void printColor() {
        black.printColor();
    }

    @Override
    public void printPiece() {
        printColor();
        super.printPiece();
    }
}
