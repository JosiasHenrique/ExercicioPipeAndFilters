package com.mycompany.expipefilters;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Josias
 */
public class ReaderFilter implements Processor {

    @Override
    public List<Software> execute() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("softwares.json"), new TypeReference<List<Software>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
