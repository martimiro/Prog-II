package prog2.vista.model;

public abstract class Casa extends  Allotjament{
    private String mida;
    private int habitacions;
    private int places;

    public Casa(String _id,String _nom,String _mida,int habitacions, int places){

        super(_id,_nom);
        this.mida = _mida;
        this.habitacions = habitacions;
        this.places = places;
    }

    //getters:
    public String getMida(){
        return this.mida;
    }
    public int getHabitacions(){
        return this.habitacions;
    }
    public int getPlaces(){
        return this.places;
    }

    //setters:
    public void setMida(String mida_){
        this.mida = mida_;
    }
    public void setHabitacions(int hab_){
        this.habitacions = hab_;
    }
    public void setPlaces(int places_){
        this.places = places_;
    }

    //altres:
    public String toString(){
        return "Mida: " + getMida() + ", habitacions: " + getHabitacions() + ", places: " + getPlaces();
    }
}
