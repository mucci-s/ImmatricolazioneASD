package it.unimol.sm.app;

import it.unimol.sm.app.automobile.Automobile;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GestoreApp {
    private static GestoreApp instance = new GestoreApp();

    public static GestoreApp getInstance() {
        return instance;
    }

    List<Automobile> listAutomobili;

    private GestoreApp() {
        File file = new File("Automobili.serr");
        if (file.exists()) {
            try (
                    FileInputStream fis = new FileInputStream("Automobili.serr");
                    ObjectInputStream objectInputStream = new ObjectInputStream(fis)
            ) {
                this.listAutomobili = (List) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.listAutomobili = new ArrayList<>();
        }

    }


    public boolean immatricolaAuto(Automobile auto) {
        assert auto != null;
        String targaGenerata = this.generaTarga();
        auto.setTarga(targaGenerata);
        this.listAutomobili.add(auto);
        try (
                FileOutputStream fos = new FileOutputStream("Automobili.serr");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)
        ) {

            objectOutputStream.writeObject(this.listAutomobili);
            return true;
        } catch (IOException e) {
            this.listAutomobili.remove(auto);
            return false;
        }
    }

    private String generaTarga() {
        String targa = Automobile.TARGA_BASE;
        if (!this.listAutomobili.isEmpty()){
            String ultimaTarga = this.listAutomobili.get(this.listAutomobili.size()-1).getTarga();
            targa = ultimaTarga;
            StringBuilder stringBuilder = new StringBuilder(targa);
            for (int i = Automobile.LUNG_TARGA - 1; i >= 0; i--) {
                if (i <= 4 && i >= 2) {
                    stringBuilder.setCharAt(i, (char) ((ultimaTarga.charAt(i) - '0' + 1) % 10 + '0'));
                    targa = stringBuilder.toString();

                    if ((targa.charAt(i)) - '0' != 0) {
                        return targa;
                    }
                } else {
                    stringBuilder.setCharAt(i, (char) ((ultimaTarga.charAt(i) - 'A' + 1) % 26 + 'A'));
                    targa = stringBuilder.toString();
                    if ((targa.charAt(i)) - 'A' != 0) {
                        return targa;
                    }
                }
            }
        }

        return targa;
    }


    public Automobile ricercaTarga(String targa) throws TargaInesistenteException {
        Automobile automobile;


        if(!this.listAutomobili.stream().anyMatch(a-> a.getTarga().equalsIgnoreCase(targa)))
            throw new TargaInesistenteException("La targa non è stata ancora assegnata");

        automobile = this.listAutomobili.stream().filter(e -> e.getTarga().equalsIgnoreCase(targa)).findAny().get();
        return automobile;
    }

    public List<Automobile> getListAutomobili() {
        return this.listAutomobili;
    }

}
