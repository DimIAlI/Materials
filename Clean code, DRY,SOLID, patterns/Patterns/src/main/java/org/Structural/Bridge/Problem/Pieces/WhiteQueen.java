package org.example.Structural.Bridge.Problem.Pieces;

import org.example.Structural.Bridge.Problem.Colors.Color;
import org.example.Structural.Bridge.Problem.Colors.White;

public class WhiteQueen extends Queen implements Color {

    White white;

    public WhiteQueen(White white) {
        this.white = white;
    }

    @Override
    public void printColor() {
        white.printColor();
    }

    @Override
    void printPiece() {
        white.printColor();
        super.printPiece();
    }
}
