package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {

        Terresrial terresrial = new Terresrial();
        //Aquatique aquatique = new Aquatique();
        Dolphin dolphin = new Dolphin("dolphin", "dolphin", 5, true,"ocean",10.5f);
        Penguin penguin = new Penguin("penguin", "penguin", 9, false, "Nord", 22.5f);

        /////////////
        //aquatique.swim();
        System.out.println("---------------------------");
        dolphin.swim();
        /////////////

        System.out.println("----------------------");
        System.out.println(terresrial.toString());
        System.out.println("----------------------");
        //System.out.println(aquatique.toString());
        System.out.println("----------------------");
        System.out.println(dolphin.toString());
        System.out.println("----------------------");
        System.out.println(penguin.toString());

        /////////////
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(dog));
        myZoo.displayAnimals();
 //       System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
   //     System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


     //   System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);
        System.out.println("--------------------");
        myZoo.addAquatique(dolphin);
        myZoo.addAquatique(penguin);
        dolphin.swim();
        penguin.swim();

        //myZoo.maxPenguinSwimmingDepth();

        myZoo.displayNumberOfAquatiqueByType();





    }

}
