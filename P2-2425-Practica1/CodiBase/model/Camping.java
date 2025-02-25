package prog2.vista.model;

import java.util.ArrayList;

public class Camping implements InCamping {
    //Atributs
    private String nom;
    private float mida;
    private ArrayList <Allotjament> allotjaments;
    private ArrayList <Client> clients;
    private LlistaReserves reserves;

    public Camping(String nom){
        this.nom = nom;
    }

    public LlistaReserves getReserves() {
        return reserves;
    }

    public float getMida() {
        return mida;
    }

}
