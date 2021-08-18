package com.example.player;

import com.example.strategy.makemove.MakeMoveStrategy;

public class ComputerPlayer extends Player{

    public ComputerPlayer(MakeMoveStrategy move, char symbol){
        super(move,symbol);
    }
}
