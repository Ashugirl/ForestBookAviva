package be.intecbrussel.app;

import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.*;
import be.intecbrussel.service.ForestNotebook;


public class NatureApp {
    public static void main(String[] args) {
        //ForestNotebook notebook = new ForestNotebook();
        Tree oak = new Tree("Oak", 30);
        oak.setLeafType(LeafType.HAND);

        Flower daffodil = new Flower("Daffodil", .3);
        daffodil.setSmell(Scent.EARTHY);

        Weed nettles = new Weed("Stinging nettles", 1.5);

        Bush brambles = new Bush("Brambles", 2);
        brambles.setFruit("blackberries");
        brambles.setLeafType(LeafType.HEART);

        Bush blueberry = new Bush("Blueberry bush", 1.3);
        blueberry.setFruit("blueberries");
        blueberry.setLeafType(LeafType.ROUND);

        Herbivore roeDeer = new Herbivore("Roe deer", 25, .65, 1.20);
        roeDeer.addPlantToDiet(nettles);
        roeDeer.addPlantToDiet(brambles);
        roeDeer.addPlantToDiet(daffodil);

        Herbivore redSquirrel = new Herbivore("Red squirrel", .3, .21, .43);
        redSquirrel.addPlantToDiet(oak);
        redSquirrel.addPlantToDiet(new Tree("walnut", 15));

        Herbivore greenFinch = new Herbivore("Greenfinch", .03, .15, .15);
        greenFinch.addPlantToDiet(new Flower("sunflower", 2));
        greenFinch.addPlantToDiet(new Weed("thistle", .5));

        Carnivore wolf = new Carnivore("Grey wolf", 39, .8, 1.50);
        wolf.setMaxFoodSize(2);

        Carnivore grassSnake = new Carnivore("Grass snake", .5, .05, 1);
        grassSnake.setMaxFoodSize(.15);

        Carnivore buzzard = new Carnivore("Buzzard", 1.1, .55, .5);
        buzzard.setMaxFoodSize(.1);

        Omnivore woodMouse = new Omnivore("Wood mouse", .023, .05, .09);
        woodMouse.addPlantToDiet(oak);
        woodMouse.addPlantToDiet(brambles);
        woodMouse.setMaxFoodSize(.05);

        Omnivore jackDaw = new Omnivore("Jackdaw", .24, .35, .39);
        jackDaw.addPlantToDiet(new Tree("hazel"));
        jackDaw.addPlantToDiet(blueberry);
        jackDaw.setMaxFoodSize(.2);

        Omnivore wildBoar = new Omnivore("Wild boar", 90, .8, 1.5);
        wildBoar.addPlantToDiet(oak);
        wildBoar.addPlantToDiet(daffodil);
        wildBoar.setMaxFoodSize(.1);


        ForestNotebook notebook = new ForestNotebook();
        notebook.addPlant(oak);
        notebook.addPlant(brambles);
        notebook.addPlant(nettles);
        notebook.addPlant(blueberry);
        notebook.addPlant(daffodil);
        notebook.addAnimal(roeDeer);
        notebook.addAnimal(redSquirrel);
        notebook.addAnimal(greenFinch);
        notebook.addAnimal(wolf);
        notebook.addAnimal(grassSnake);
        notebook.addAnimal(buzzard);
        notebook.addAnimal(woodMouse);
        notebook.addAnimal(jackDaw);
        notebook.addAnimal(wildBoar);
        System.out.println(notebook.getPlantCount());
        System.out.println(notebook.getAnimalCount());
        System.out.println();

        //unsorted list
        notebook.printNotebook();
        System.out.println();

        //herbivore, carnivore and omnivore lists printed separately
        System.out.println("Herbivores: ");
        for(Herbivore herbivore : notebook.getHerbivores()){
        System.out.println(herbivore);}
        System.out.println();

        System.out.println("Carnivores: ");
        for(Carnivore carnivore : notebook.getCarnivores()){
            System.out.println(carnivore);}
        System.out.println();

        System.out.println("Omnivores: ");
        for(Omnivore omnivore : notebook.getOmnivores()){
            System.out.println(omnivore);}
        System.out.println();


        System.out.println("Plants and animals sorted by name: ");
        notebook.sortPlantByName();
        notebook.sortAnimalByName();
        notebook.printNotebook();
        System.out.println();

        System.out.println("Plants and animals sorted by height: ");
        notebook.sortPlantsByHeight();
        notebook.sortAnimalsByHeight();
        notebook.printNotebook();

        //using printDiet method to print specific lists of herbivore diets
        System.out.println();
        roeDeer.printDiet();
        System.out.println();
        greenFinch.printDiet();
        System.out.println();
        redSquirrel.printDiet();
    }
}
