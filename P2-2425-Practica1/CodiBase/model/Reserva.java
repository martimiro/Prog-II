package prog2.vista.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate entrada;
    private LocalDate sortida;
    private Client client;
    private Allotjament allotjament;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){

    }
    public LocalDate getEntrada(){
        return  entrada;
    }
    public LocalDate getSortida(){
        return sortida;
    }

    public Allotjament getAllotjament(){
        return this.allotjament;
    }
}
