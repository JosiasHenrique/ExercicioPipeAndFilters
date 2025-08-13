package com.mycompany.expipefilters;

import java.util.List;

/**
 *
 * @author Josias
 */
public class ExPipeFilters {

    public static void main(String[] args) {
      
        
        ReaderFilter rf = new ReaderFilter();
        
        List<Software> softwares = rf.execute();
        
        for(Software s: softwares) {
            System.out.println(s.getSo());
        }
    }
}
