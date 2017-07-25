/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author mostafaoraei
 */
public class Fil extends Mohre {

    @Override
    public boolean isValidMove(Position p) {
        if(Math.abs(p.getCol() - position.getCol()) == Math.abs(p.getRow()- position.getRow())) {
            return true;
        } else if(p.getCol() == position.getCol() && p.getRow()== position.getRow()) {
            return false;
        } else {
            return false;
        }
    }
    
    
}
