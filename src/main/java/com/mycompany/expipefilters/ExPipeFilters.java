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
public class ExPipeFilters {

    public static void main(String[] args) {
        
        List<Software> softwares = loadSoftwaresFromJson("softwares.json");
        
       Pipe pipe = new Pipe();
       
       pipe.addFilter(new CategoryFilter("IDE"));
       
       List<Software> filtrados = pipe.execute(softwares);
       
       filtrados.forEach(System.out::println);

    }

    public static List<Software> loadSoftwaresFromJson(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(
                    new File(filePath),
                    new TypeReference<List<Software>>() {
            }
            );
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
            return null;
        }
    }
}
