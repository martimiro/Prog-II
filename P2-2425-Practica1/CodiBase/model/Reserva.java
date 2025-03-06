package prog2.vista.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate entrada;
    private LocalDate sortida;
    private Client client;
    private Allotjament allotjament;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){

        setAllotjament(allotjament);
        setClient(client);
        setEntrada(dataEntrada);
        setSortida(dataSortida);

    }

    //Getters:
    public LocalDate getEntrada(){
        return  entrada;
    }
    public LocalDate getSortida(){
        return sortida;
    }
    public Allotjament getAllotjament(){
        return this.allotjament;
    }

    //Setters:
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    public void setSortida(LocalDate sortida) {
        this.sortida = sortida;
    }

    //Altres:
    public String toString(){
        return "Allotjament reservat: " +this.allotjament.toString()+ "\n Client que ha fet la reserva: " + this.client.toString() + "\n Data d'entrada: " this.getEntrada().toString() + " Data de sortida:"+this.getSortida();
    }
}
