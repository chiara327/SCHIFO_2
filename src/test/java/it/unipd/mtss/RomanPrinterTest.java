////////////////////////////////////////////////////////////////////
// Chiara Grossele 2101063
// Giuliano Banchieri 2101081
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void shouldPrint1(){
        int intero =1;
        String risultato=RomanPrinter.print(intero);
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", risultato);        
    }
    @Test
    public void shouldPrint2(){
        int intero =2;
        String risultato=RomanPrinter.print(intero);
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", risultato);
        
    }
    @Test
    public void shouldPrint3(){
        int intero =3;
        String risultato=RomanPrinter.print(intero);
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", risultato);
        
    }
}