package prog2.vista.model;

import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList <Reserva> llista;

    public int getNumReserves() {
        return llista.size();
    }
}
