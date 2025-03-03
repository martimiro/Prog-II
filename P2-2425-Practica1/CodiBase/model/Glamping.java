package prog2.vista.model;

public class Glamping extends Casa{
    private String material;
    private boolean mascota;

    //Constructor:
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){

        super.setNom(nom_);
        super.setId(idAllotjament_);
        super.setMida(mida);
        super.setHabitacions(habitacions);
        super.setPlaces(placesPersones);
        this.setMascota(casaMascota);
        this.setMaterial(material);

    }
    //getters:
    public  String getMaterial(){
        return this.material;
    }
    public boolean getMascota(){
        return this.mascota;
    }

    //setters:
    public void setMaterial(String material_){
        this.material = material_;
    }
    public void setMascota(boolean mascota_){
        this.mascota = mascota_;
    }
}
