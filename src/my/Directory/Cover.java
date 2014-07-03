/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.Directory;

import java.util.ArrayList;

/**
 *
 * @author Shu
 */


public class Cover {
    public class TCover{
    String name;
    int coast;
        TCover(String t, int i){
        name=t;
        coast=i;
    }
        
    int GetCoast(){
          return coast; 
       }
}
    
    ArrayList<TCover> LCover = new ArrayList<TCover>();

    public Cover(){/*заменить на считывание из файла*/
    TCover t1 = new TCover("мелованная", 1);
    TCover t2 = new TCover("каландрированная", 2);
    LCover.add(t1);
    LCover.add(t2);
    }
    
        public int ChoiceCover(int i){
        TCover t=LCover.get(i);
        return t.GetCoast();
    }
}
