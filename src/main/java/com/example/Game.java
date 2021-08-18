package com.example;

import com.example.model.Move;
import com.example.player.Player;

import java.util.Scanner;
import java.util.Stack;

public class Game {
    private Player p1;
    private Player p2;
    private Board b;
    public Game(Player p1,Player p2,Board b){
        this.p1=p1;
        this.p2=p2;
        this.b=b;
    }
    public void run(){
        int count=0;
        int dimension=b.getDimension();
        boolean switchPlayer=false;
        Player currPlayer=p1;
        Stack<Move> st=new Stack<>();
        while(count<=(dimension*dimension)){
            currPlayer=switchPlayer?p2:p1;
            printBoard(this.b);
            System.out.println("Enter your move");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            if(x==5){
            // Todo Undo move
            }
            int y=sc.nextInt();
            boolean validMove=addMove(x,y,currPlayer.getSymbol(),this.b);
            if(!validMove){
                System.out.println("Please enter a valid move");
                continue;
            }

            if(getWinner(this.b,x-1,y-1,currPlayer.getSymbol())){
                printBoard(this.b);
                System.out.println("You won");
                return;
            }
            switchPlayer=!switchPlayer;
            count++;
        }
    }
    //TODO Winning strategy need to be implemented
    public boolean getWinner(Board b,int x,int y,char symbol){
        int count=0;
        for(int i=0;i<3;i++){
            if(b.getGrid()[i][y]==symbol){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        count=0;
        for(int i=0;i<3;i++){
            if(b.getGrid()[x][i]==symbol){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        count=0;
        if(x==y){
            for(int i=0;i<3;i++){
                if(b.getGrid()[i][i]==symbol){
                    count++;
                }
            }
        }
        if(count==3){
            return true;
        }
        count=0;
        if(x==y || (x==0&&y==2)||(x==2&&y==0)){
            for(int i=0;i<3;i++){
                if(b.getGrid()[i][2-i]==symbol){
                    count++;
                }
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }

    //TODO MakeMove Strategy need to be implemented
    public boolean addMove(int x,int y, char symbol, Board b ){
        // check if the move is valid or not
        char grid[][]=b.getGrid();
        if(x<=3 && x>=1 && y<=3 && y>=1 && b.getGrid()[x-1][y-1]=='_'){
            grid[x-1][y-1]=symbol;
            return true;
        }
         return false;
    }
    public void printBoard(Board b){
        int n=b.getDimension();
        char grid[][]=b.getGrid();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
