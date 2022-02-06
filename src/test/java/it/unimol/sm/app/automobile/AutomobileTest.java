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

    @Test
    void getProprietario() {
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

    @Test
    void getTarga() {
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

    @Test
    void getModello() {
        try {
            Automobile auto = new Automobile("fiat",
                    "panda",
                    "sport",
                    "32",
                    "100",
                    new Proprietario("simone","mucci","24/02/1999","1234567"));
            assertEquals("panda",auto.getModello());
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getAllestimento() {
        try {
            Automobile auto = new Automobile("fiat",
                    "panda",
                    "sport",
                    "32",
                    "100",
                    new Proprietario("simone","mucci","24/02/1999","1234567"));
            assertEquals("sport",auto.getAllestimento());
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getCilindrata() {
        try {
            Automobile auto = new Automobile("fiat",
                    "panda",
                    "sport",
                    "32",
                    "100",
                    new Proprietario("simone","mucci","24/02/1999","1234567"));
            assertEquals("32",auto.getCilindrata());
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getPotenza() {
        try {
            Automobile auto = new Automobile("fiat",
                    "panda",
                    "sport",
                    "32",
                    "100",
                    new Proprietario("simone","mucci","24/02/1999","1234567"));
            assertEquals("100",auto.getPotenza());
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }


}