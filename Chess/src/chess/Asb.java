/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Ali_M
 */
public class Asb extends Mohre {
    @Override
    public boolean isValidMove(Position p){
        if((Math.abs(p.getRow()- this.position.getRow())==1 && Math.abs(p.getCol()- this.position.getCol())==2)|| 
              (Math.abs(p.getRow()- this.position.getRow())==2 && Math.abs(p.getCol()- this.position.getCol())==1)  ){
            return true;
        }//check roe and cool
        else return false;
    }
}
