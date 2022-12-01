package org.example.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.model.Animal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalService {

    private final Map<Integer, Animal> petData = new HashMap<>();


    public void mainManu() {
        JsonMapper jsonMapper = new JsonMapper();
        PetShelter petShelter = new PetShelter(jsonMapper, ".json");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 0 to load last saved database.");
        System.out.println("Press 1 to add Animal.");
        System.out.println("Press 2 to view Animals.");
        System.out.println("Press 3 to delete Animal.");
        System.out.println("Press 4 to exit.");
        int number = scanner.nextInt();

        switch (number) {
            case 0 -> {
                petData.putAll(petShelter.deserialize());
                mainManu();
            }
            case 1 -> {
                petData.put((enumerator()), inputAnimal());
                mainManu();
            }
            case 2 -> {
                System.out.println(petData);
                mainManu();
            }
            case 3 -> {
                petData.remove(removeAnimal());
                mainManu();
            }
            case 4 -> {

                petShelter.serialize(petData);
                break;
            }
            default -> {
                System.out.println("No such operation");
                mainManu();
            }
        }
    }


    public Animal inputAnimal() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.println("Enter animal breed: ");
        String breed = scanner.nextLine();

        System.out.println("Enter animal age: ");
        int age = scanner.nextInt();

        System.out.println("Enter animal gender (1 - male, 2 - female): ");
        int genderInput = scanner.nextInt();
        while (genderInput != 1 && genderInput != 2) {
            System.out.println("You must enter 1 or 2." +
                    "\nEnter animal gender (1 - male, 2 - female): ");
            genderInput = scanner.nextInt();
        }
        boolean gender = genderInput == 1;


        return new Animal(name, breed, new Date(), age, gender);
    }

    public int enumerator() {
        Integer key = 1;
        while (petData.containsKey(key)) {
            key++;
        }
        return key;
    }

    public Integer removeAnimal() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number animal for delete: ");
        return scanner.nextInt();
    }
}
