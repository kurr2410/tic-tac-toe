package com.example.player;

import com.example.strategy.makemove.MakeMoveStrategy;

public abstract class Player {
    private MakeMoveStrategy move;
    private char symbol;
    public Player(MakeMoveStrategy move,char symbol){
        this.move=move;
        this.symbol=symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
