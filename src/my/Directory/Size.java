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
public class Size {
    public class TSize{
    String name;
    int coast;
        TSize(String t, int i){
        name=t;
        coast=i;
    }
    int GetCoast(){
          return coast; 
       }
    }
    
    ArrayList<TSize> LSize=new ArrayList<TSize>();
    
    public Size(){/*заменить на считывание из файла*/
    TSize t1 = new TSize("140x200", 1);
    TSize t2 = new TSize("200x290",2);
    
    LSize.add(t1);
    LSize.add(t2);
    }
    
    public int ChoiceSize(int i){
        TSize t=LSize.get(i);
        return t.GetCoast();
    }
}
