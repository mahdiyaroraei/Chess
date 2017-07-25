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
public class Rokh extends Mohre {
  @Override
  public boolean isValidMove(Position p){
      if(p.getCol()==this.position.getCol() && p.getRow()==this.position.getRow())return false;//check for don.t choice position you have now
      else if(p.getCol()==this.position.getCol() || p.getRow()==this.position.getRow()){
          return true;
      }//chck roe and cool
      else return false;
  }
}
