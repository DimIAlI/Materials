package org.example.Structural.Bridge.Bridge.Pieces;

import org.example.Structural.Bridge.Bridge.Colors.Color;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color);
    }

    @Override
    public void printPiece() {
        color.printColor();
        System.out.println("queen");
    }

}
