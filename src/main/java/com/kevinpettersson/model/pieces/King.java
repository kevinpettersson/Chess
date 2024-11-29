package com.kevinpettersson.model.pieces;

import com.kevinpettersson.model.board.Square;

public class King extends Piece {

    private boolean hasMoved;

    public King(int row, int col, Color color){
        super(row, col, color);
        this.hasMoved = false;

    }

    @Override
    public boolean validMove(Square newPosition) {
        return false;
    }
}
