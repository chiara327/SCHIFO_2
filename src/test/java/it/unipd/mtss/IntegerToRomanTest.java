////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void shouldConvertToI() {
        int intero = 1;
        String risultato = IntegerToRoman.convert(intero);
        assertEquals("I", risultato);
    }
    @Test
    public void shouldConvertToII() {
        int intero = 2;
        String risultato = IntegerToRoman.convert(intero);
        assertEquals("II", risultato);
    }
    @Test
    public void shouldConvertToIII() {
        int intero = 3;
        String risultato = IntegerToRoman.convert(intero);
        assertEquals("III", risultato);
    }
}