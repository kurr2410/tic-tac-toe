package com.example;

public class Board {
    private char [][]grid;
    private int dimension;
    public Board(int dimension){
        this.dimension=dimension;
        this.grid=new char[dimension][dimension];
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                this.grid[i][j]='_';
            }
        }
    }

    public int getDimension() {
        return dimension;
    }

    public char[][] getGrid() {
        return grid;
    }
}
