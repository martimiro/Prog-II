package prog2.vista.model;

import prog2.vista.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList <Reserva> llista;

    public int getNumReserves() {
        return llista.size();
    }

    public ArrayList<Reserva> getAllotjamentsMateixaId(String id_){

        Reserva reservaActual;
        ArrayList <Reserva> llistaId = new ArrayList<Reserva>();
        Iterator<Reserva> itrLlista = llista.iterator();

        while(itrLlista.hasNext()){

            reservaActual = itrLlista.next();

            if (reservaActual.getAllotjament().getId().equals(id_)){
                llistaId.add(reservaActual);
            }


        }
        return llistaId;
    }

    public boolean datesSuperposades(Reserva reserva, LocalDate dataEntrada, LocalDate dataSortida){
        boolean iniciDates,finalDates;

        iniciDates = (dataEntrada.isAfter(reserva.getEntrada()) || dataEntrada.equals(reserva.getEntrada())) && (dataEntrada.isBefore(reserva.getSortida()) || dataEntrada.equals(reserva.getSortida()));

        finalDates =  (dataSortida.isAfter(reserva.getEntrada()) || dataSortida.equals(reserva.getEntrada())) && (dataSortida.isBefore(reserva.getSortida()) || dataSortida.equals(reserva.getSortida()));


        return iniciDates || finalDates;
    }

    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){

        String idAllotjament = allotjament.getId();
        ArrayList <Reserva> allotjamentMateixaId = getAllotjamentsMateixaId(idAllotjament);
        boolean datesSuperposades = false;

        if (!allotjamentMateixaId.isEmpty()){

            Iterator<Reserva> itrReserves = allotjamentMateixaId.iterator();

            while(itrReserves.hasNext() && !datesSuperposades){

            }

        }
    }


    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva{

    }
}
