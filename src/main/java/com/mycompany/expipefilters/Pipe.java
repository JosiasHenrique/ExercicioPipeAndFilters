package com.mycompany.expipefilters;

import java.util.ArrayList;
import java.util.List;

public class Pipe implements Processor {

    private final List<Processor> filters = new ArrayList<>();

    public void addFilter(Processor filter) {
        filters.add(filter);
    }

    @Override
    public List<Software> execute(List<Software> softwares) {
        List<Software> result = softwares;
        for (Processor filter : filters) {
            result = filter.execute(result);
        }
        return result;
    }
}
