package it.unimol.sm;

import it.unimol.sm.GUI.MenuFrame;
import it.unimol.sm.ui.MenuPrincipaleUI;

public class Main {

    public static void main(String[] args) {
        init();
    }

    private static void init(){
        //MenuPrincipaleUI menu = MenuPrincipaleUI.getInstance();prova commit
        MenuFrame.main(new String[]{});
        //menu.esegui();
    }
}