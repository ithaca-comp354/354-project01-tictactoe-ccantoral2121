package edu.ithaca.dragon.games.tictactoe.player;

import java.util.stream.IntStream;

import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;

public class RuledBasedPlayer implements TicTacToePlayer {

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
     
        
        //Rule #5
        if(curBoard.isSquareOpen(new Pair<>(1,1))){
            return new Pair<>(1,1);
            
        }else{
            for (int y=0; y<3; y++){
                for(int x=0; x<3;x++){
                    if (curBoard.isSquareOpen(new Pair<>(x,y))){
                        return new Pair<>(x,y);
                    }
                }
            }
        }
        
        return null;
    }
    
}
