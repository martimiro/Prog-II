package prog2.vista.model;

public abstract class Casa extends  Allotjament{
    private String mida;
    private int habitacions;
    private int places;

    //getters:
    public String getMida(){
        return mida;
    }
    public int getHabitacions(){
        return habitacions;
    }
    public int getPlaces(){
        return places;
    }
    //setters:
    public void setMida(String mida_){
        this.mida = mida_;
    }
}
