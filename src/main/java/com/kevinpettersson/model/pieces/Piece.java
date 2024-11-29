package com.kevinpettersson.model.pieces;

import com.kevinpettersson.model.board.Square;

public abstract class Piece {

    private Square position;
    private Color color;

    public Piece(int row, int col, Color color){
        this.position = new Square(row, col);
        this.color = color;
    }

    public abstract boolean validMove(Square newPosition);


    // GETTERS AND SETTERS
    public Square getPosition(){
        return position;
    }
    public Color getColor(){ return color; }

    public void setPosition(Square position){
        this.position = position;
    }
    public void setColor(Color color){ this.color = color; }
}
