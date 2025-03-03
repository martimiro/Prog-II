package prog2.vista.model;

public abstract class Allotjament implements InAllotjament {

    private String id;
    private String nom;
    private int estadaMinimaTempBaixa;
    private int estadaMinimaTempAlta;

    //getters:
    public String getNom(){
        return nom;
    }
    public String getId(){
        return id;
    }
    public int getEstadaMinimaTempBaixa(){
        return estadaMinimaTempBaixa;
    }
    public int getEstadaMinimaTempAlta(){
        return estadaMinimaTempAlta;
    }

    //setters:
    public void setId(String id_){
        this.id = id_;
    }
    public void setNom(String nom_){
        this.nom = nom_;
    }
    public void setEstadaMinimaTempBaixa(int num){
        this.estadaMinimaTempBaixa = num;
    }
    public void setEstadaMinimaTempAlta(int num){
        this.estadaMinimaTempAlta = num;
    }

}
