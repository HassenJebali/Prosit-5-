package tn.esprit.gestionzoo.entities;

public class Terresrial extends Animal{
    private int nbrLegs ;
    public Terresrial() {}

    public Terresrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {return nbrLegs;}
    public void setNbrLegs(int nbrLegs) {this.nbrLegs = nbrLegs;}
}
