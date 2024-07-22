package org.example.Structural.Bridge.Bridge.Pieces;

import org.example.Structural.Bridge.Bridge.Colors.Color;

public abstract class Piece {
    Color color;

    public Piece(Color color) {
        this.color = color;
    }
    public abstract void printPiece();
}
