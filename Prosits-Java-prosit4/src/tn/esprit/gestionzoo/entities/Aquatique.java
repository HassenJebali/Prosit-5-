package tn.esprit.gestionzoo.entities;

public class Aquatique extends Animal {
    private String habitat;

    public Aquatique() {}
    public Aquatique(String family, String name, int age, boolean isMammal, String habitat){
    super(family, name, age, isMammal);
    this.habitat = habitat;}
    public String getHabitat() {return habitat;}
    public void setHabitat(String habitat) {this.habitat = habitat;}

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }

    @Override
    public String toString() {
        return "Aquatique{" + "habitat=" + habitat + '}';
    }

}
