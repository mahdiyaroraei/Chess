/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author mahdiar
 */
public class Player {
    private static Player whitePlayer;
    private static Player blackPlayer;
    
    public static Player getWhitePlayer(){//check for white player
        if(whitePlayer== null){
            whitePlayer=new Player();
            return whitePlayer;
        }
        else return whitePlayer;
    }
    public static Player getBlackPlayer(){//check for black player
        if(blackPlayer== null){
            blackPlayer=new Player();
            return blackPlayer;
        }
        else return blackPlayer;
    }
}
