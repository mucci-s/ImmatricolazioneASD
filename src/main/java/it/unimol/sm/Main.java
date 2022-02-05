package it.unimol.sm;

import it.unimol.sm.GUI.MenuFrame;
import it.unimol.sm.ui.MenuPrincipaleUI;

public class Main {

    public static void main(String[] args) {
        init();
    }

    private static void init(){
        //MenuPrincipaleUI menu = MenuPrincipaleUI.getInstance();provas pipelines
//        MenuFrame.main(new String[]{});
        MenuFrame frame = new MenuFrame();
        frame.setVisible(true);

        //menu.esegui();
    }
}
