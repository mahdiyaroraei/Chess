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
public abstract class Mohre {
    
    protected Position position;
    protected Color color;
    protected boolean isRemoved;
    public abstract boolean isValidMove(Position p);
}
