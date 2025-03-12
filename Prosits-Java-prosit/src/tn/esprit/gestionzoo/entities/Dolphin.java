package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique{
   private float swimSpeed;

    public Dolphin() {}
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat, float swimSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimSpeed = swimSpeed;
    }
    //get set
    public float getSwimSpeed() {return swimSpeed;}
    public void setSwimSpeed(float swimSpeed) {this.swimSpeed = swimSpeed;}

    @Override
    public void swim(){
        System.out.println("this "+ getName() + " is swimming");
    }

    @Override
    public String toString() {
        return super.toString() +  "Dolphin{" + "swimSpeed=" + swimSpeed + '}';
    }


}

