package it.unimol.sm.app.proprietario;

import java.io.Serializable;

public class Proprietario implements Serializable {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String numeroPatente;

    public Proprietario(String nome, String cognome, String dataNascita, String numeroPatente) throws DataFormatException {
        this.nome = nome;
        this.cognome = cognome;
        if(dataNascita.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"))
            this.dataNascita = dataNascita;
        else throw new DataFormatException("Formato della data errato: (dd/mm/aaaa)");
        this.numeroPatente = numeroPatente;
    }


    public String getNumeroPatente() {
        return numeroPatente;
    }

    @Override
    public String toString() {
        return "\n nome'" + nome + '\''
                + "\n cognome='" + cognome + '\''
                + "\n data di nascita='" + dataNascita + '\''
                + "\n numero della patente='" + numeroPatente + '\'' + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }
}
