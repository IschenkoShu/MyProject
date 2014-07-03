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
public class Page {
    public class TPage{
    String name;
    double density;
    double thickness;
    double coast;
        TPage(String t, double j, double i, double k){
        name=t;
        density=j;
        thickness=k;
        coast=i;
    }
    double GetThickness(){return thickness;} 
    double GetCoast(){return coast;}
    double GetDensity(){return density;}
}
    ArrayList<TPage> LPage = new ArrayList<TPage>();
    
    public Page(){/*заменить на считывание из файла*/
    TPage t1 = new TPage("офсетная", 65, 0.25, 0.08);
    TPage t2 = new TPage("офсетная", 80, 0.3, 0.11);
    TPage t3 = new TPage("мелованная", 130, 1.3, 0.13);
    TPage t4 = new TPage("мелованная", 150, 1.5,0.15);
    TPage t5 = new TPage("каландрированная", 90, 0.8, 0.09);
    TPage t6 = new TPage("каландрированная", 120, 1.2, 0.12);
    TPage t7 = new TPage("каландрированная", 160, 1.6, 0.16);
    
    LPage.add(t1);
    LPage.add(t2);
    LPage.add(t3);
    LPage.add(t4);
    LPage.add(t5);
    LPage.add(t6);
    LPage.add(t7);
    }
    
    public double ChoicePage(int i){
        TPage t=LPage.get(i);
        return t.GetCoast();
    }
    public double ChoicePageT(int i){
        TPage t=LPage.get(i);
        return t.GetThickness();
    }    
    public double ChoicePageD(int i){
        TPage t=LPage.get(i);
        return t.GetDensity();
    }
 
}
