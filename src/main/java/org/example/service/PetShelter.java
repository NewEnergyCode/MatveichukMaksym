package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Animals;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class PetShelter {

    private final ObjectMapper mapper;
    private final String extension;

    public PetShelter(ObjectMapper mapper, String extension) {
        this.mapper = mapper;
        this.extension = extension;
    }

    public void serialize(Map<Integer, Animals>  animals) {

        try {
            mapper.writeValue(new File("src/main/resources" + extension), animals);
        } catch (IOException e) {
            System.out.println("Can not created file.");
        }

    }

    public Optional<Map<Integer, Animals>> deserialize() {

        try {
            return Optional.of(mapper.readValue(new File("src/main/resources" + extension), Map.class));
        } catch (IOException e) {
            System.out.println("Can not created file.");
            return null;
        }

    }


}


