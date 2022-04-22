package be.intecbrussel.service;

import be.intecbrussel.entities.animal_entities.Animal;
import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.Plant;

import java.util.*;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook(){

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        System.out.println();
        System.out.println("Number of plants seen today: ");
        plantCount = 0;
        for (Plant plant : plants) {
            plantCount++;

        }
        return plantCount;

    }

    public int getAnimalCount() {
        System.out.println();
        System.out.println("Number of animals seen today: ");
        animalCount = 0;
        for (Animal animal : animals) {
            animalCount++;

        }
        return animalCount;
    }

    public void addAnimal(Animal animal) {
        Set<Animal> animalSet = new HashSet<>();
        if (animal instanceof Herbivore herbivore && !herbivores.contains(animal)) {
            herbivores.add(herbivore);
            animalSet.add(herbivore);}
        else if (animal instanceof Carnivore carnivore && !carnivores.contains(animal)) {
            carnivores.add(carnivore);
            animalSet.add(carnivore);
        } else if (animal instanceof Omnivore omnivore && !omnivores.contains(animal)) {
            omnivores.add(omnivore);
            animalSet.add(omnivore);
        }
        animals.addAll(animalSet);
        }

    public void addPlant(Plant plant){
        if(!plants.contains(plant)){
        plants.add(plant);}

    }
    public void printNotebook(){
        System.out.println("Plants: ");
        for(Plant p: plants){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("Animals: ");
        for (Animal a : animals){
            System.out.println(a);
        }
    }

    public void sortAnimalByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }
    public void sortPlantByName(){
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparingDouble(Animal::getHeight));
    }

    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparingDouble(Plant::getHeight));
    }
}