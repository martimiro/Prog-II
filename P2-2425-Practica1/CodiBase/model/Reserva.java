package prog2.vista.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate entrada;
    private LocalDate sortida;
    private Client client;
    private Allotjament allotjament;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){

        setAllotjament_(allotjament);
        setClient(client);
        setDataEntrada(dataEntrada);
        setDataSortida(dataSortida);

    }

    //Getters:
    public LocalDate getDataEntrada(){
        return  entrada;
    }
    public LocalDate getDataSortida(){
        return sortida;
    }
    public Allotjament getAllotjament_(){
        return this.allotjament;
    }
    public Client getClient(){
        return this.client;
    }
    //Setters:
    public void setAllotjament_(Allotjament allotjament) {
        this.allotjament = allotjament;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setDataEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    public void setDataSortida(LocalDate sortida) {
        this.sortida = sortida;
    }

    //Altres:
    public String toString(){
        return "Allotjament reservat: " +this.allotjament.toString()+ "\n Client que ha fet la reserva: " + this.client.toString() + "\n Data d'entrada: "+ this.getDataEntrada().toString() + " Data de sortida:"+this.getDataSortida();
    }
}
