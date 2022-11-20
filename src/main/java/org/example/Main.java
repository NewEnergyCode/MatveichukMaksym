package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.service.InputAnimal;
import org.example.service.PetShelter;

public class Main {

    public static void main(String[] args) {


        InputAnimal inputAnimal = new InputAnimal();
        JsonMapper jsonMapper = new JsonMapper();
        PetShelter petShelter = new PetShelter(jsonMapper, ".json");
//        petShelter.serialize(inputAnimal.inputAnimal());
        inputAnimal.mainManu();
//        System.out.println(inputAnimal.inputAnimal());


    }
}
