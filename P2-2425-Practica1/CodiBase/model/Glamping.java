package prog2.vista.model;

public class Glamping extends Casa{
    private String material;
    private boolean mascota;

    //Constructor:
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){

        super.super.setNom(nom_);
        super.super.setId(idAllotjament_);
        super.setMida(mida);
        super.setHabitacions(habitacions);
        super.setPlaces(placesPersones);
        this.mascota = casaMascota;
        this.material = material;

    }
}
