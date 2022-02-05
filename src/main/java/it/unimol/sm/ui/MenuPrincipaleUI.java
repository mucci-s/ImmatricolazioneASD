package it.unimol.sm.ui;

public class MenuPrincipaleUI extends UI{
    private static MenuPrincipaleUI ourInstance = new MenuPrincipaleUI();

    public static MenuPrincipaleUI getInstance() {
        return ourInstance;
    }

    private MenuPrincipaleUI() {
    }


    @Override
    public void esegui() {
        int scelta;
        do{
            this.showMenu();
            scelta = this.inputInt();
            ImmatricolazioneUI immatricolazioneUI = new ImmatricolazioneUI();
            VisualizzaAutomibiliUI visualizzaAutomibiliUI = new VisualizzaAutomibiliUI();
            ControlloTargaUI controlloTargaUI = new ControlloTargaUI();

            switch (scelta){
                case 1:
                    immatricolazioneUI.esegui();
                    break;
                case 2:
                    visualizzaAutomibiliUI.esegui();
                    break;
                case 3:
                    controlloTargaUI.esegui();
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
            }

        }while(scelta != 0);


    }

    private void showMenu(){
        System.out.println(">>Scegli une delle seguenti funzioni");
        System.out.println("1: Immatricola automobile");
        System.out.println("2: Visualizza auto immatricolate");
        System.out.println("3: Controllo targa auto");
        System.out.println("0: Esci");
    }
}
