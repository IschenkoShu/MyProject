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
    double coast;
        TBinding(String t, double i){
        name=t;
        coast=i;
    }
    double GetCoast(){
          return coast; 
    }
}
    ArrayList<TBinding> LBinding=new ArrayList<TBinding>();
    public Binding(){/*заменить на считывание из файла*/
    TBinding t1 = new TBinding("КБС", 6);
    TBinding t2 = new TBinding("скоба",7);
    
    LBinding.add(t1);
    LBinding.add(t2);
    }
    public double ChoiceBinding(int i){
        TBinding t=LBinding.get(i);
        return t.GetCoast();
    }
}
