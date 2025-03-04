package prog2.vista.model;

import prog2.vista.vista.ExcepcioReserva;

import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;



public class Camping implements InCamping {
    //Atributs
    private String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Client> clients;
    private LlistaReserves reserves;

    // Constructor:
    public Camping(String nom) {
        this.nom = nom;
    }

    //Getters:
    public LlistaReserves getLlistaReserves() {

        return reserves;
    }

    public float calculMidaTotalParceles() {
        float midaTotal = 0;

        Iterator itrAllotjaments = allotjaments.iterator();

        while (itrAllotjaments.hasNext()) {

            Allotjament allotjamentActual = (Allotjament) itrAllotjaments.next();

            if (allotjamentActual instanceof Parcela) {

                Parcela parcelaActual = (Parcela) allotjamentActual;
                midaTotal += parcelaActual.getMida();
            }
        }

        return midaTotal;
    }

    public String getNom() {

        return nom;
    }

    public ArrayList<Allotjament> getLlistaAllotjaments() {

        return allotjaments;
    }

    public ArrayList<Client> getLlistaClients() {

        return clients;
    }

    public int getNumAllotjaments() {

        return allotjaments.size();
    }

    public int getNumReserves() {

        return reserves.getNumReserves();
    }

    public int getNumClients() {

        return clients.size();
    }

    public boolean clientRepetit(String nom_, String dni_){
        boolean repetit = false;
        return repetit;
    }

    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {

        if(!clientRepetit(nom_,dni_)) {
            Client clientNou = new Client(nom_, dni_);
            clients.addLast(clientNou);
        } else {

            throw ExcepcioReserva ("Aquest client ja existeix.");
        }

    }

    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {

        Parcela parcelaNova = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        allotjaments.addLast(parcelaNova);
    }

    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

        Bungalow bungalowNou = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        allotjaments.addLast(bungalowNou);
    }

    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                      int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                                      boolean serveisExtra, String codiWifi) {
        BungalowPremium bungalowPremiumNou = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        allotjaments.addLast(bungalowPremiumNou);
    }

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               String material, boolean casaMascota) {
        Glamping glampingNou = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        allotjaments.addLast(glampingNou);
    }

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                boolean terrassaBarbacoa) {
        MobilHome mobilHomeNou = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        allotjaments.addLast(mobilHomeNou);
    }

    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

        boolean condicio = false;
        Allotjament allotjamentActual;
        Client clientActual;

        Iterator<Client> itrClient = clients.iterator();

        while (itrClient.hasNext() && !condicio) {

            clientActual = itrClient.next();

            if (clientActual.getDni() == dni_) {

                condicio = true;

            }
        }
        condicio = false;
        Iterator<Allotjament> itrAllotjament = allotjaments.iterator();

        while (itrAllotjament.hasNext() && !condicio) {

            allotjamentActual = itrAllotjament.next();


            if (allotjamentActual.getId() == id_) {
                this.reserves.afegirReserva(allotjamentActual, clientActual, dataEntrada, dataSortida);
                condicio = true;
            }

        }
    }

    public int calculaAllotjamentsOperatius() {
        int comptador = 0;
        Allotjament allotjamentActual;

        Iterator<Allotjament> itrAllotjament = allotjaments.iterator();

        while(itrAllotjament.hasNext()){

            allotjamentActual = itrAllotjament.next();

            if(allotjamentActual.correcteFuncionament()){
                comptador +=1;
            }
        }

        return comptador;
    }
    public Allotjament getAllotjamentEstadaMesCurta(){

        Allotjament allotjamentActual, allotjamentMinim;
        Iterator <Allotjament> itrAllotjament = allotjaments.iterator();

        allotjamentMinim = itrAllotjament.next();

        while(itrAllotjament.hasNext()){

            allotjamentActual = itrAllotjament.next();

            if (allotjamentActual.getEstadaMinimaTempBaixa() < allotjamentMinim.getEstadaMinimaTempBaixa()){
                allotjamentMinim = allotjamentActual;
            }

        }
    }



}


