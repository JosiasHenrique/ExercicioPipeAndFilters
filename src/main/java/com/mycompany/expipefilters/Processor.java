package com.mycompany.expipefilters;

import java.util.List;

/**
 *
 * @author Josias
 */
public interface Processor {
    
    List<Software> execute(List<Software> softwares);
}
