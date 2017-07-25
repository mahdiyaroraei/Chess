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
    
    public Sarbaz[] sarbazHa = new Sarbaz[8];
    public Fil[] filHa = new Fil[2];
    public Asb[] asbHa = new Asb[2];
    public Shah shah = new Shah();
    public Rokh[] rokhHa = new Rokh[2];
    public Vazir vazir = new Vazir();

    public void move(Mohre mohre, Position p) throws InvalidMohreException, InvalidPositionException {
        if (mohre.isValidMove(p)) {
            boolean isPlayerMohre = false;
            if (mohre instanceof Sarbaz) {
                for (Sarbaz sarbaz : sarbazHa) {
                    if (mohre == sarbaz) {
                        isPlayerMohre = true;
                        break;
                    }
                }
            } else if (mohre instanceof Fil) {
                for (Fil fil : filHa) {
                    if (mohre == fil) {
                        isPlayerMohre = true;
                        break;
                    }
                }
            } else if (mohre instanceof Shah) {
                if (mohre == shah) {
                    isPlayerMohre = true;
                }
            } else if (mohre instanceof Rokh) {
                for (Rokh rokh : rokhHa) {
                    if (mohre == rokh) {
                        isPlayerMohre = true;
                        break;
                    }
                }
            } else if (mohre instanceof Vazir) {
                if (mohre == vazir) {
                    isPlayerMohre = true;
                }
            } else if (mohre instanceof Asb) {
                for (Asb asb : asbHa) {
                    if (mohre == asb) {
                        isPlayerMohre = true;
                        break;
                    }
                }
            }

            if (isPlayerMohre) {
                if (isPositionFillByFriends(p)){
                    
                }else{
                    throw new InvalidPositionException();
                }
            } else {
                // Selected mohre is not for the player
                throw new InvalidMohreException();
            }
        } else {
            // This segment say mohre can't move to this position
            throw new InvalidPositionException();
        }
    }
    
    private boolean isPositionFillByEnemies(Position p) {
        if (this == Player.get) {
            
        } 
        for (Sarbaz sarbaz : sarbazHa) {
            if (p.isEquals(sarbaz.position)) {
                return true;
            }
        }
        for (Fil fil : filHa) {
            if (p.isEquals(fil.position)) {
                return true;
            }
        }
        if (p.isEquals(shah.position)) {
                return true;
        }
        for (Rokh rokh : rokhHa) {
            if (p.isEquals(rokh.position)) {
                return true;
            }
        }
        if (p.isEquals(vazir.position)) {
                return true;
        }
        for (Asb asb : asbHa) {
            if (p.isEquals(asb.position)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPositionFillByFriends(Position p) {
        for (Sarbaz sarbaz : sarbazHa) {
            if (p.isEquals(sarbaz.position)) {
                return true;
            }
        }
        for (Fil fil : filHa) {
            if (p.isEquals(fil.position)) {
                return true;
            }
        }
        if (p.isEquals(shah.position)) {
                return true;
        }
        for (Rokh rokh : rokhHa) {
            if (p.isEquals(rokh.position)) {
                return true;
            }
        }
        if (p.isEquals(vazir.position)) {
                return true;
        }
        for (Asb asb : asbHa) {
            if (p.isEquals(asb.position)) {
                return true;
            }
        }
        return false;
    }
        
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
