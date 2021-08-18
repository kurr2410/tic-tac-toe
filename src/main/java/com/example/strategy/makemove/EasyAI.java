package com.example.strategy.makemove;

import com.example.model.Move;

public class EasyAI implements MakeMoveStrategy{
    @Override
    public Move makeMove() {
        return new Move();
    }
}
