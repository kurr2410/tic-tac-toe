package com.example.model;

import com.example.player.Player;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Move {

    @Getter
    @Setter
    private int x;
    @Getter
    @Setter
    private int y;
    @Getter
    @Setter
    private Player p;

    public Move(){
    }
    public Move(int x, int y, Player p){
        this.x=x;
        this.y=y;
        this.p=p;
    }

}
