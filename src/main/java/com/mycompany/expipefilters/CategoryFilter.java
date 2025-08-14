package com.mycompany.expipefilters;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter implements Processor {

    private String category;

    public CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public List<Software> execute(List<Software> softwares) {
        System.out.println("Filtrando por categoria: " + category + "...\n");

        if (softwares == null) {
            return List.of();
        }

        return softwares.stream()
                .filter(s -> s.getTipo().equalsIgnoreCase(category))
                .toList();
    }

}
