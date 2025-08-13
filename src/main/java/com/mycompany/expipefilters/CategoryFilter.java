package com.mycompany.expipefilters;

import java.util.List;

public class CategoryFilter implements Processor {

    private String category;

    public CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public List<Software> execute(List<Software> softwares) {
        System.out.println("Filtrando por categoria: " + category + "...\n");
        List<Software> newList = null;

        for (Software x : softwares) {
            if (x.getTipo().equalsIgnoreCase(category)) {
                newList.add(x);
            }
        }

        return newList;
    }

}
