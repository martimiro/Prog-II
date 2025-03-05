package prog2.vista.model;

public class MobilHome extends Casa{
    private boolean bbq;


    //constructor:
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                     boolean terrassaBarbacoa){
        super.setNom(nom_);
        super.setId(idAllotjament_);
        super.setMida(mida);
        super.setHabitacions(habitacions);
        super.setPlaces(placesPersones);
        this.setBbq(terrassaBarbacoa);

    }
    //getter:
    public boolean getBbq(){
        return this.bbq;
    }
    //setter:
    public void setBbq(boolean bbq_){
        this.bbq = bbq_;
    }
    //Altres:
    public boolean correcteFuncionament(){
        return this.getBbq();
    }
}
