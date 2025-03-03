package prog2.vista.model;

public class BungalowPremium extends Bungalow{
    private boolean serveisExtra;
    private String codiWifi;



    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                           int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                           boolean serveisExtra, String codiWifi){

        super ( nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.setServeisExtra(serveisExtra);
        this.setCodiWifi(codiWifi);
    }
    //Getters:

    public boolean getServeisExtra(){
        return this.serveisExtra;
    }
    public String getCodiWifi(){
        return this.codiWifi;
    }


    //Setters:

    public void setServeisExtra(boolean serveisExtra_){
        this.serveisExtra = serveisExtra_;
    }
    public void setCodiWifi(String codiWifi_){
        this.codiWifi = codiWifi_;
    }
}
