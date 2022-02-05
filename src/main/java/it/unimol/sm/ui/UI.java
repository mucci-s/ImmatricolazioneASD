package it.unimol.sm.ui;

import java.util.Scanner;

abstract public class UI {
    public abstract void esegui();

    protected String inputString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    protected int inputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
