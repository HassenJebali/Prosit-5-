package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.*;


import java.util.Arrays;

public class Zoo {

    private Aquatique[] aquatiqueAnimals = new Aquatique[10];
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }



    public Aquatique[] getAquatiqueAnimals() {return aquatiqueAnimals;}

    public void addAquatique(Aquatique aquatique) {
        int i ;
            for ( i = 0 ;  i<aquatiqueAnimals.length; i++){
                if (aquatiqueAnimals[i]  == null ){
                aquatiqueAnimals[i] = aquatique;
                System.out.println("la place d'indice "+ i +" est rserver pour l'animal "+ aquatique.getName());
                break;
            }

        }
    }

    public void displayNumberOfAquatiqueByType() {
        int p = 0, d = 0;
        for (Aquatique aquatique : aquatiqueAnimals) {
            if (aquatique instanceof Penguin) {
                p++;
            }
            if (aquatique instanceof Dolphin) {
                d++;
            }
            System.out.println("Il y'a " + d + " dolphin et " + p + " penguin");
        }                                         }

    /* fausse fonctionement ...ClassCastException dans le main */
    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0 ;
        for(Aquatique aquatique : aquatiqueAnimals){
            Penguin penguin = (Penguin) aquatique;
            maxDepth = Math.max(maxDepth, penguin.getSwimDepth());
        }
    return maxDepth ; }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
