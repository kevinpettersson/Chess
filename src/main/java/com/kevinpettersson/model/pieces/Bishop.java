package com.kevinpettersson.model.pieces;

import com.kevinpettersson.model.board.Square;

public class Bishop extends Piece {

    public Bishop(int row, int col, Color color){
        super(row, col, color);
    }

    @Override
    public boolean validMove(Square newPosition) {
        return false;
    }
}
