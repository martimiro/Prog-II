package prog2.vista.model;

public abstract class Allotjament implements InAllotjament {

    private String id;
    private String nom;
    private int estadaMinimaTempBaixa;
    private int estadaMinimaTempAlta;

    //getters:
    String getNom(){
        return nom;
    }
    String getId(){
        return id;
    }
    int getEstadaMinimaTempBaixa(){
        return estadaMinimaTempBaixa;
    }
    int getGetEstadaMinimaTempAlta(){
        return EstadaMinimaTempAlta;
    }

    //setters:
    void setId(String id_){
        this.id = id_;
    }
    void setNom(String nom_){
        this.nom = nom_;
    }
    void setEstadaMinimaTempBaixa(int num){
        this.estadaMinimaTempBaixa = num;
    }
    void setEstadaMinimaTempAlta(int num){
        this.estadaMinimaTempAlta;
    }

}
