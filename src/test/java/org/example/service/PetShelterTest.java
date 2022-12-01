package org.example.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PetShelterTest {
    private final JsonMapper jsonMapper = new JsonMapper();
    private final PetShelter petShelter = new PetShelter(jsonMapper, ".json");
    private final Map<Integer, Animal> petData = new HashMap<>();
    Animal input = new Animal("Tom", "Cat", new Date(), 25, true);
    private final Map<Integer, Animal> petDataTest = new HashMap<>();


@Test
    public void serializeTest(){
    petDataTest.put(1,input);
    petShelter.serialize(petDataTest);
}
@Test
public void deserializeTest() {
    petDataTest.put(1,input);
    petShelter.serialize(petDataTest);
    Map<Integer, Animal> deserialize = petShelter.deserialize();
    Assert.assertEquals(deserialize, petShelter.deserialize());
}
}
