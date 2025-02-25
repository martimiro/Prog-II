package prog2.vista.model;

public class Parcela extends Allotjament {
    private float mida;
    private boolean conexio;

    public Parcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        super.setNom(nom_);
        super.setId(idAllotjament_);
        this.mida = metres;
        this.conexio = connexioElectrica;

    }
}
