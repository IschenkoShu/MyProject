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
public class Lamination {
        public class TLamination{
    String name;
    int coast;
        TLamination(String t, int i){
        name=t;
        coast=i;
    }
}
    ArrayList<TLamination> LLamination=new ArrayList<TLamination>();
    Lamination(){/*заменить на считывание из файла*/
    TLamination t1 = new TLamination("нет", 1);
    TLamination t2 = new TLamination("матовая",2);
    TLamination t3 = new TLamination("глянцевая",3);
    LLamination.add(t1);
    LLamination.add(t2);
    LLamination.add(t3);
    }
}
