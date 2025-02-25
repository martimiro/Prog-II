package prog2.vista.model;

public class Bungalow extends Casa{
    private int placesParking;
    private boolean terrassa, tv, ac;

    // Constructor:
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        super.super.setNom(nom_);
        super.super.setId(idAllotjament_);
        super.setMida(mida);
        super.setHabitacions(habitacions);
        super.setPlaces(placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.ac = aireFred;
    }
    //getters:

}
