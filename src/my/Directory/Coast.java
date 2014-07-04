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
    
    String GetName(){
        return name;
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
    TCoast t5 = new TCoast("стоимость подготовительных работ", 400);
    
    LCoast.add(t1);
    LCoast.add(t2);
    LCoast.add(t3);
    LCoast.add(t4);
    LCoast.add(t5);
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
  
   public int SumPage(int color, int black, int printing, int size){
      int sum;
      System.out.println(size);
      System.out.println(color);
      System.out.println(black);
      System.out.println(printing);
      if (size==1)
      sum  = (color+black)/2*printing;
      else sum = (color+black)*printing;
      System.out.println(sum);
      return sum;     
  }
  
   public double CoastPrint(int color, int black, int sumPage){
     // Coast c = new Coast();
      int i=0;
      TCoast c = LCoast.get(i);
      String s = c.GetName();
      if (color==0){
      while (s =="печать страниц ч/б"){ 
        i++;
        c = LCoast.get(i);
        s = c.GetName();
      }
      }
      else {
      while (s =="печать страниц цвет"){ 
        i++;
        c = LCoast.get(i);
        s = c.GetName();
      }
      }
      double coast = c.GetCoast();
      double sum=sumPage*coast;
      System.out.println(sum);
      //уточнить про стоимость печати обложки
      return sum;
   }
    public double CoastPage(int sumPage, double coastP, double coastC){
     // Coast c = new Coast();
      double sum=sumPage*coastP + coastC;   
      System.out.println(sum);
      return sum;
   }
    public double CoastCut(int printing){
      int i=0;  
      TCoast c = LCoast.get(i);
      String s = c.GetName();
      while (s =="стоимость подрезки"){ 
        i++;
        c = LCoast.get(i);
        s = c.GetName();
      }
      double coast = c.GetCoast();
      double sum=printing*coast;  
      System.out.println(sum);
      return sum; 
     }
     public double CoastLamination(int size, double coastL){
      double sum;
      if (size==2) sum=coastL;
      else sum = coastL*2;
      System.out.println(sum);
      return sum; 
     } 
     
    public double Coef(){ //возможно усложнение
         return 2;
     }
     
  public double CoastBook(double coast_print, double coast_page, double coast_cut, double coast_lamination, double coef, int printing, double coastB){
      double coast;
            int i=0;  
      TCoast c = LCoast.get(i);
      String s = c.GetName();
      while (s =="стоимость подготовительных работ"){ 
        i++;
        c = LCoast.get(i);
        s = c.GetName();
      }
      double prepar = c.GetCoast();
      coast = (coast_print+ coast_page +coast_cut+printing*coastB+prepar)/printing*coef+coast_lamination;
      coast=Math.rint(100*coast)/100;
      return coast;
  }
  
  public double CoastPrinting(double coast, int printing){
      double coastP;
      coastP=coast*printing;
      coastP=Math.rint(100*coastP)/100;
      return coastP;
  }
  
}
