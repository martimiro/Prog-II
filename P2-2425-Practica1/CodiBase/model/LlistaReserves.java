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

            if (reservaActual.getAllotjament_().getId().equals(id_)){
                llistaId.add(reservaActual);
            }


        }
        return llistaId;
    }

    public boolean datesSuperposadesMetode(Reserva reserva, LocalDate dataEntrada, LocalDate dataSortida){
        boolean iniciDates,finalDates;

        iniciDates = (dataEntrada.isAfter(reserva.getDataEntrada()) || dataEntrada.equals(reserva.getDataEntrada())) && (dataEntrada.isBefore(reserva.getDataSortida()) || dataEntrada.equals(reserva.getDataSortida()));

        finalDates =  (dataSortida.isAfter(reserva.getDataEntrada()) || dataSortida.equals(reserva.getDataEntrada())) && (dataSortida.isBefore(reserva.getDataSortida()) || dataSortida.equals(reserva.getDataSortida()));


        return iniciDates || finalDates;
    }

    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){

        String idAllotjament = allotjament.getId();
        ArrayList <Reserva> allotjamentMateixaId = getAllotjamentsMateixaId(idAllotjament);
        boolean datesSuperposades = false;

        if (!allotjamentMateixaId.isEmpty()){

            Iterator<Reserva> itrReserves = allotjamentMateixaId.iterator();

            while(itrReserves.hasNext() && !datesSuperposades){

                    datesSuperposades = datesSuperposadesMetode(itrReserves.next(),dataEntrada,dataSortida);


            }

            return !datesSuperposades;

        } else {
            return true;
        }
    }


    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva{

        if( allotjamentDisponible(allotjament,dataEntrada,dataSortida) ){

            Reserva reservaNova = new Reserva(allotjament,client,dataEntrada,dataSortida);
            this.llista.add(reservaNova);

        } else {

            throw new ExcepcioReserva("Aquestes dates coincideixen amb les d'una altre reserva.");

        }
    }


}
