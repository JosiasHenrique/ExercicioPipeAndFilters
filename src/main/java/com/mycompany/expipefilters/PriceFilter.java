package com.mycompany.expipefilters;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josias
 */
public class PriceFilter implements Processor {

    private double priceMin, priceMax;

    public PriceFilter(double priceMin, double priceMax) {
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    @Override
    public List<Software> execute(List<Software> softwares) {
        System.out.println("Filtrando por preço de: " + priceMin + " até " + priceMax + "\n");

        if (softwares == null) {
            return List.of(); // lista imutável e vazia
        }

        return softwares.stream()
                .filter(s -> s.getPreco() >= priceMin && s.getPreco() <= priceMax)
                .toList();
    }

}
