package edu.ithaca.dragon.games.tictactoe.player;

import java.util.stream.IntStream;

import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.GameStatus;
import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;

public class RuledBasedPlayer implements TicTacToePlayer {

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
         
        
        //Rule #5
        if(curBoard.isSquareOpen(new Pair<>(1,1))){
            return new Pair<>(1,1);
            
        }else if(curBoard.calcGameStatus() == GameStatus.PLAYING) {

                if(curBoard.isSquareOpen(new Pair<>(0,0))){
                    return new Pair<>(0,0);
                }else if(curBoard.isSquareOpen(new Pair<>(0,1))){
                    return new Pair<>(0,1);
                }
                else if(curBoard.isSquareOpen(new Pair<>(2,2))){
                    return new Pair<>(2,2);
                }else if(curBoard.isSquareOpen(new Pair<>(2,1))){
                    return new Pair<>(2,1);

                }else if(curBoard.isSquareOpen(new Pair<>(2,0))){
                    return new Pair<>(2,0);
                }else if(curBoard.isSquareOpen(new Pair<>(1,0))){
                    return new Pair<>(1,0);
                }
                else if(curBoard.isSquareOpen(new Pair<>(0,2))){
                    return new Pair<>(0,2);
                }else{
                    return new Pair<>(1,2);
                }
        
        }
        
        return null;
    }
    
}
