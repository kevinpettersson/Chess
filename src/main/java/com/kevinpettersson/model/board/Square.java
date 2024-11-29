package com.kevinpettersson.model.board;

public class Square {

    private int row;
    private int column;

    public Square(int x, int y){
        this.row = x;
        this.column = y;
    }



    // GETTERS AND SETTERS
    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    public void setRow(int x){
        this.row = x;
    }

    public void setColumn(int y){
        this.column = y;
    }
}
