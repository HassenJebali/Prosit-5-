package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique {
    private float swimDepth ;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal,String habitat, float swimDepth) {
    super(family, name, age, isMammal, habitat);
    this.swimDepth = swimDepth;
    }
    public float getSwimDepth() {return swimDepth;}
    public void setSwimDepth(float swimDepth) {this.swimDepth = swimDepth;}

    @Override
    public void swim(){
        System.out.println("this "+ getName() + " is swimming");
    }

    @Override
    public String toString() {
        return super.toString() + "Penguin{" + "swimDepth=" + swimDepth + '}';
    }


}

