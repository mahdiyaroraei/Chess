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
public class Shah extends Mohre{

    @Override
    public boolean isValidMove(Position p) {
        return (p.getRow() - position.getRow() == 1 || p.getCol() - position.getCol() == 1);
    }
    
}
