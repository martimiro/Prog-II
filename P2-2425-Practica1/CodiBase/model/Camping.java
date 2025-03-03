package prog2.vista.model;

import java.util.ArrayList;

public class Camping implements InCamping {
    //Atributs
    private String nom;
    private float mida;
    private ArrayList <Allotjament> allotjaments;
    private ArrayList <Client> clients;
    private LlistaReserves reserves;

    // Constructor:
    public Camping(String nom){
        this.nom = nom;
    }
    //Getters:
    public LlistaReserves getLlistaReserves() {

        return reserves;
    }

    public float calculMidaTotalParceles() {

        return mida;
    }

    public String getNom(){

        return nom;
    }

    public ArrayList<Allotjament> getLlistaAllotjaments(){

        return allotjaments;
    }

    public ArrayList<Client> getLlistaClients(){

        return clients;
    }

    public int getNumAllotjaments(){

        return allotjaments.size();
    }
    public int getNumReserves(){

        return reserves.getNumReserves();
    }
    public int getNumClients(){

        return clients.size();
    }

}
