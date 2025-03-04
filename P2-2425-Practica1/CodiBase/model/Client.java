package prog2.vista.model;

import prog2.vista.vista.ExcepcioReserva;

public class Client {
    private String nom;
    private String dni;

    public Client(String nom_ ,String dni){
        if (dniCorrecte(dni)) {
            this.setNom(nom_);
            this.setDni(dni);
        } else {
            throw ExcepcioReserva ("El DNI ha de tindre 9 xifres.")
        }
    }
    //Getters:
    public String getNom(){
        return this.nom;
    }
    public String getDni(){
        return this.dni;
    }

    //Setters:
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    // Altres:
    public boolean dniCorrecte(String dni){

        if (dni.length() == 9){
            return true;
        }else{
            return false;
        }
    }


}
