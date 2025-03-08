import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prog2.vista.model.Allotjament;
import prog2.vista.model.InAllotjament;

class AllotjamentTest {

    private Allotjament allotjament;

    @BeforeEach
    void setUp() {
        // Creem una instància anònima d'Allotjament per a tests

        allotjament = new Allotjament("ID001", "Allotjament Test", 5, 3) {
            @Override
            public boolean correcteFuncionament() {
                return false;
            }
        };

    }

    @Test
    void constructorValid() {
        assertEquals("Allotjament Test", allotjament.getNom());
        assertEquals("ID001", allotjament.getId());
        assertEquals(5, allotjament.getEstadaMinima(InAllotjament.Temp.ALTA));
        assertEquals(3, allotjament.getEstadaMinima(InAllotjament.Temp.BAIXA));
    }



    @Test
    void testSetEstadaMinima() {
        allotjament.setEstadaMinima(6, 4);
        assertEquals(6, allotjament.getEstadaMinima(InAllotjament.Temp.ALTA));
        assertEquals(4, allotjament.getEstadaMinima(InAllotjament.Temp.BAIXA));
    }

    @Test
    void testToString() {
        String expected = "ID: ID001, Nom: Allotjament Test, Estada minima Temp Baixa: 3, Estada minima Temp Alta: 5";
        assertEquals(expected, allotjament.toString());
    }
}



