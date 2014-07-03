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
    int density;
    int coast;
        TPage(String t, int j, int i){
        name=t;
        density=j;
        coast=i;
    }
        
    int GetCoast(){
          return coast; 
       }
}
    ArrayList<TPage> LPage = new ArrayList<TPage>();
    
    public Page(){/*заменить на считывание из файла*/
    TPage t1 = new TPage("офсетная", 65, 1);
    TPage t2 = new TPage("офсетная", 80, 2);
    TPage t3 = new TPage("мелованная", 130, 3);
    TPage t4 = new TPage("мелованная", 150, 4);
    TPage t5 = new TPage("каландрированная", 90, 5);
    TPage t6 = new TPage("каландрированная", 120, 6);
    TPage t7 = new TPage("каландрированная", 160, 7);
    
    LPage.add(t1);
    LPage.add(t2);
    LPage.add(t3);
    LPage.add(t4);
    LPage.add(t5);
    LPage.add(t6);
    LPage.add(t7);
    }
    
        public int ChoicePage(int i){
        TPage t=LPage.get(i);
        return t.GetCoast();
    }
 
}
