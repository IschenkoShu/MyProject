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
    TCoast list;
    TCoast printBlack;
    TCoast printColor;
    TCoast cut;
    TCoast prepar;
    public Coast(){/*заменить на считывание из файла*/
    list = new TCoast("листоподбор", 2);
    printBlack = new TCoast("печать страниц ч/б", 0.2);
    printColor = new TCoast("печать страниц цвет", 2.5);
    cut = new TCoast("стоимость подрезки", 7);
    prepar = new TCoast("стоимость подготовительных работ", 400);
    
    }
    
 
  public double ThicknessBack(int color, int black, double thickness){
      double t;
      t = (color+black)/2*thickness;
      return t;
  }
  
  public double Weight(int color, int black, int size, int printing, double density){
      double w;
      double s;
      if (size==1) s=0.14*0.2;
      else s=0.2*0.29;
      w=(s*(color+black)*density/2+ s*2*250+10)*printing/1000;
      w=Math.rint(100*w)/100;
      return w;
  }
  
   public int SumPage(int color, int black, int printing, int size){
      int sum;
      if (size==1)
      sum  = (color+black)/2*printing;
      else sum = (color+black)*printing;
      return sum;     
  }
  
   public double CoastPrint(int color, int black, int sumPage, int printing, double coastC){
      double coast;
      if (color==0){
          coast = printBlack.GetCoast();
      }
      else {
          coast = printColor.GetCoast();
      }
      double sum=sumPage*coast+coastC*printing;
      return sum;
   }
    public double CoastPage(int sumPage, double coastP, double coastC, int printing){
      double sum=sumPage*coastP + coastC*printing;   
      return sum;
   }
    public double CoastCut(int printing){  
      double coast = cut.GetCoast();
      double sum=printing*coast;  
      return sum; 
     }
     public double CoastLamination(int size, double coastL){
      double sum;
      if (size==2) sum=coastL*2;
      else sum = coastL;
      return sum; 
     } 
     
    public double Coef(){ //возможно усложнение
         return 2;
     }
     
  public double CoastBook(double coast_print, double coast_page, double coast_cut, double coast_lamination, double coef, int printing, double coastB){
      double coast;
      double preparing = prepar.GetCoast();
      coast = (coast_print+ coast_page +coast_cut+printing*coastB+preparing)/printing*coef+coast_lamination;
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
