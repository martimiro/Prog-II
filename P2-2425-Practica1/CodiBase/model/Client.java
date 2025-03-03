package prog2.vista.model;

public class Client {
    private String nom;
    private String dni;

    public Client(String nom_ ,String dni){
        this.setNom(nom_);
        this.setDni(dni);
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
}
