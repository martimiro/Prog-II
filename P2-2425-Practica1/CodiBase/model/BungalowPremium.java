package prog2.vista.model;

public class BungalowPremium extends Bungalow{
    private boolean wifi, serveisExtra;

    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                           int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                           boolean serveisExtra, String codiWifi){

        Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
        int placesParquing, boolean terrassa, boolean tv, boolean aireFred);

        this.wifi = codiWifi;
        this.serveisExtra = serveisExtra;
    }
}
