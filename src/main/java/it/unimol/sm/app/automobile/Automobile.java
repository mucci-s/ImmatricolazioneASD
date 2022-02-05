package it.unimol.sm.app.automobile;

import it.unimol.sm.app.proprietario.Proprietario;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Automobile implements Serializable {
    private String produttore;
    private String modello;
    private String allestimento;
    private String cilindrata;
    private String potenza;

    private Proprietario proprietario;

    private String targa;
    private String dataImmmatricolazione;

    public static final String TARGA_BASE = "AA000AA";
    public static final int LUNG_TARGA = 7;

    public Automobile(String produttore,
                      String modello,
                      String allestimento,
                      String cilindrata,
                      String potenza,
                      Proprietario proprietario) {

        this.produttore = produttore;
        this.modello = modello;
        this.allestimento = allestimento;
        this.cilindrata = cilindrata;
        this.potenza = potenza;
        this.proprietario = proprietario;
        this.dataImmmatricolazione = this.getDataString();
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    private String getDataString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.format(new Date());
    }

    public String getProduttore() {
        return produttore;
    }

    @Override
    public String toString() {
        return "Automobile <" + this.targa + ">{"
                + "\n produttore:'" + produttore + '\''
                + "\n modello:'" + modello + '\''
                + "\n allestimento:'" + allestimento + '\''
                + "\n cilindrata:'" + cilindrata + '\''
                + "\n potenza:'" + potenza + '\''
                + "\n data di immmatricolazione='" + dataImmmatricolazione + '\''
                + "\n >>>Proprietario:" + this.proprietario.toString()
                + '}';
    }


    public Proprietario getProprietario() {
        return proprietario;
    }

    public String getTarga() {
        return targa;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Automobile){
            return ((Automobile) obj).getTarga().equals(this.targa);
        }
        return false;
    }


    public String getModello() {
        return modello;
    }

    public String getAllestimento() {
        return allestimento;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public String getPotenza() {
        return potenza;
    }

    public String getDataImmmatricolazione() {
        return dataImmmatricolazione;
    }
}
