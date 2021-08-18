package com.example.player;

import com.example.strategy.makemove.MakeMoveStrategy;

public class HumanPlayer extends Player{
    public HumanPlayer(MakeMoveStrategy move, char symbol){
        super(move,symbol);
    }
}
