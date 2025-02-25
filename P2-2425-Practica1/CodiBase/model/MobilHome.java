package prog2.vista.model;

public class MobilHome extends Casa{
    private boolean bbq;


    //constructor:
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                     boolean terrassaBarbacoa){
        super.super.setNom(nom_);
        super.super.setId(idAllotjament_);
        super.setMida(mida);
        super.setHabitacions(habitacions);
        super.setPlaces(placesPersones);
        this.bbq = terrassaBarbacoa;

    }
}
