package prog2.vista.model;

public abstract class Allotjament implements InAllotjament {

    private String id;
    private String nom;
    private long estadaMinimaTempBaixa;
    private long estadaMinimaTempAlta;

    //getters:
    public String getNom(){
        return nom;
    }
    public String getId(){
        return id;
    }

    public long getEstadaMinima(Temp temp){

        return switch (temp) {
            case BAIXA -> estadaMinimaTempBaixa;
            case ALTA -> estadaMinimaTempAlta;
            default -> 0;
        };

    }

    //setters:
    public void setId(String id_){
        this.id = id_;
    }
    public void setNom(String nom_){
        this.nom = nom_;
    }
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_){

        this.estadaMinimaTempAlta = estadaMinimaALTA_ ;
        this.estadaMinimaTempBaixa = estadaMinimaBAIXA_;
    }

}
