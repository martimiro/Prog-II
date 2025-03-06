package prog2.vista.model;

public class Parcela extends Allotjament {
    private float mida;
    private boolean conexio;

    public Parcela(String nom_, String idAllotjament_, float mida, boolean connexioElectrica) {
        super.setNom(nom_);
        super.setId(idAllotjament_);
        this.setMida(mida);
        this.setConexioElectrica(connexioElectrica);

    }
    //getters:
    public float getMida(){
        return this.mida;
    }

    public boolean isConexioElectrica() {
        return this.conexio;
    }
    //Setters:

    public void setMida(float mida_){
        this.mida = mida_;
    }
    public void setConexioElectrica(boolean conexio_){
        this.conexio = conexio_;
    }
    //Altres:
    public boolean correcteFuncionament(){

        return this.isConexioElectrica();
    }

    public String toString(){
        return "Nom: " + super.getNom() + ", ID allotjament: " + super.getId() + ", mida: " + getMida() + ", connexió: " + isConexioElectrica();
    }
}
