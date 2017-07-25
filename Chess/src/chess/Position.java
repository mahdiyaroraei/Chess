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
public class Position {

    public static final int ROW_COUNT = 8;
    public static final int COL_COUNT = 8;
    private int row;
    private int col;

    public Position(int row, int col) throws InvalidRowException, InvalidColException {
        setRow(row);
        setCol(col);
    }

    public void setRow(int row) throws InvalidRowException {
        if (row > ROW_COUNT || row < 1) {
            throw new InvalidRowException();
        } else {
            this.row = row;
        }
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) throws InvalidColException{
        if (col > COL_COUNT || col < 1) {
            throw new InvalidColException();
        } else {
            this.col = col;
        }
    }

    public int getCol() {
        return col;
    }
    
    public boolean isEquals(Position p){
        return (p.getCol() == getCol() && p.getRow() == getRow());
    }
}
