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
public class Vazir extends Mohre {

    @Override
    public boolean isValidMove(Position p) {

        if (Math.abs(p.getRow() - position.getRow()) == Math.abs(p.getCol() - position.getCol())) { // Check crosswise move
            return true;
        } else if (p.getRow() - position.getRow() == 0 || p.getCol() - position.getCol() == 0) { // Check horizontal and vertical move
            return !(p.getRow() - position.getRow() == 0 && p.getCol() - position.getCol() == 0); // Check not current position
        } else {
            return false;
        }
    }

}
