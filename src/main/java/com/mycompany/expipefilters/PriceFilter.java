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
        List<Software> newList = new ArrayList<>();

        for (Software x : softwares) {
            if (x.getPreco() >= priceMin && x.getPreco() <= priceMax) {
                newList.add(x);
            }
        }

        return newList;
    }

}
