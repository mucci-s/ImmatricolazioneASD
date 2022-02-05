package it.unimol.sm.app.automobile;

import it.unimol.sm.app.proprietario.DataFormatException;
import it.unimol.sm.app.proprietario.Proprietario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomobileTest {


    @Test
    void getProduttore() {
        try {
            Automobile auto = new Automobile("fiat",
                    "panda",
                    "sport",
                    "32",
                    "100",
                    new Proprietario("simone","mucci","24/02/1999","1234567"));
            assertEquals("fiat",auto.getProduttore());
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }
}