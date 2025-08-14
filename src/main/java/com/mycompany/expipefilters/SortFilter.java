package com.mycompany.expipefilters;

import java.util.List;

/**
 *
 * @author Josias
 */
public class SortFilter implements Processor{
    
    private SortType tipo;

    public SortFilter(SortType tipo) {
        this.tipo = tipo;
    }

    @Override
    public List<Software> execute(List<Software> softwares) {
        if(softwares == null) {
            return List.of();
        }
        
        softwares.sort((t1, t2) -> {
            int comparacao = Double.compare(t1.getPreco(), t2.getPreco());
            return tipo == SortType.ASCENDING ? comparacao : -comparacao;
        });
        
        return softwares;
    }
    
    
}
