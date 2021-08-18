package com.example;

import com.example.factory.gameFactory.GameFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        System.out.println("Enter 2 the type of players");
        Scanner sc=new Scanner(System.in);
        String playerType1=sc.next();
        String playerType2=sc.next();
        System.out.println("Enter the dimension");
        int dimension=sc.nextInt();
        Game game= GameFactory.create(playerType1,playerType2,dimension);
        game.run();
    }
}
