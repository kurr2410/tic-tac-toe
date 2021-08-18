package com.example.factory.playerFactory;

import com.example.player.ComputerPlayer;
import com.example.player.HumanPlayer;
import com.example.player.Player;
import com.example.strategy.makemove.AskInput;
import com.example.strategy.makemove.MakeMoveStrategy;

public class PlayerFactory {
    public static Player create(String type, MakeMoveStrategy makeMoveStrategy, char symbol){
        if(type.equals("Human")){
            return new HumanPlayer(makeMoveStrategy,symbol);
        }else {
            return new ComputerPlayer(makeMoveStrategy,symbol);
        }
    }
}
