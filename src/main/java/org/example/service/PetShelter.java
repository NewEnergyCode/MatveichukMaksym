package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Animal;

import java.io.File;
import java.io.IOException;

import java.util.Map;


public class PetShelter {

    private final ObjectMapper mapper;
    private final String extension;

    public PetShelter(ObjectMapper mapper, String extension) {
        this.mapper = mapper;
        this.extension = extension;
    }

    public void serialize(Map<Integer, Animal> animals) {

        try {
            mapper.writeValue(new File("src/main/resources" + extension), animals);
        } catch (IOException e) {
            System.out.println("Can not created file.");
        }

    }

    public Map<Integer, Animal> deserialize() {

        try {
            return mapper.readValue(new File("src/main/resources" + extension), Map.class);
        } catch (IOException e) {
            System.out.println("Can not created file.");
            return null;
        }

    }


}


