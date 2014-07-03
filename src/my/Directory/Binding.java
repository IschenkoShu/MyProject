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
public class Binding {
        public class TBinding{
    String name;
    int coast;
        TBinding(String t, int i){
        name=t;
        coast=i;
    }
    int GetCoast(){
          return coast; 
    }
}
    ArrayList<TBinding> LBinding=new ArrayList<TBinding>();
    public Binding(){/*заменить на считывание из файла*/
    TBinding t1 = new TBinding("КБС", 1);
    TBinding t2 = new TBinding("скоба",2);
    
    LBinding.add(t1);
    LBinding.add(t2);
    }
    public int ChoiceBinding(int i){
        TBinding t=LBinding.get(i);
        return t.GetCoast();
    }
}
