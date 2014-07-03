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
public class Coast {
      public class TCoast{
    String name;
    double coast;
        TCoast(String t, double i){
        name=t;
        coast=i;
    }
        
    double GetCoast(){
          return coast; 
       }
}
    ArrayList<TCoast> LCoast = new ArrayList<TCoast>();
    
    public Coast(){/*заменить на считывание из файла*/
    TCoast t1 = new TCoast("листоподбор", 2);
    TCoast t2 = new TCoast("печать страниц ч/б", 0.2);
    TCoast t3 = new TCoast("печать страниц цвет", 2.5);
    TCoast t4 = new TCoast("стоимость подрезки", 7);
    TCoast t5 = new TCoast("стоимость ламинации", 10);
    TCoast t6 = new TCoast("стоимость подготовительных работ", 400);
    
    LCoast.add(t1);
    LCoast.add(t2);
    LCoast.add(t3);
    LCoast.add(t4);
    LCoast.add(t5);
    LCoast.add(t6);
    }
    
        public double ChoiceCoast(int i){
        TCoast t=LCoast.get(i);
        return t.GetCoast();
    }
 
  public double ThicknessBack(int color, int black, double thickness){
      double t=5;
      t = (color+black)/2*thickness;
      return t;
  }
  
  public double Weight(int color, int black, int size, double density){
      double w;
      double s;
      if (size==1) s=0.14*0.2;
      else s=0.2*0.29;
      w=s*(color+black)*density/2+ s*2*250+10;
      w=Math.rint(100*w)/100;
      return w;
  }
}
