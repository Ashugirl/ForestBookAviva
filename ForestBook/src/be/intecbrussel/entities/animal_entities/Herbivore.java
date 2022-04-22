package be.intecbrussel.entities.animal_entities;

import be.intecbrussel.entities.plant_entities.Plant;

import java.util.*;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
        }


    public void printDiet(){
        System.out.println("The main diet of the " + getName() + " consists of: ");
        System.out.println(plantDiet);
    }


    @Override
    public String toString() {
        return "Herbivore{name= " + getName() + ", weight=" + getWeight() +
                "kgs, height= " + getHeight() + "m, length= " + getLength() +
                "m, plantDiet=" + getPlantDiet() +
                "} ";
    }
}

