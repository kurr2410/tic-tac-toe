package com.example.factory.gameFactory;

import com.example.Board;
import com.example.Game;
import com.example.factory.playerFactory.PlayerFactory;
import com.example.player.Player;
import com.example.strategy.makemove.AskInput;

import java.awt.datatransfer.Clipboard;
import java.util.List;

public class GameFactory {
   public static Game create(String playerType1, String playerType2,int dimension){
        Player p1= PlayerFactory.create(playerType1,new AskInput(),'X');
        Player p2= PlayerFactory.create(playerType2,new AskInput(),'O');
        Board b=new Board(dimension);
        return new Game(p1,p2,b);
    }
}
