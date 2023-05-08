public class InvestimentoAgent {

    private TerminalUI ui;

    public InvestimentoAgent(TerminalUI ui){
        this.ui=ui;
    }

    public void run(){
        ui.writeln("************************************");
        ui.writeln("       CALCOLATORE INVESTIMENTO     ");
        ui.writeln("************************************");

        boolean goAhead=true;
        while(goAhead) {
            ui.write("Calcolare un nuovo investimento? (S|N) ");
            String answer = ui.read();
            if (answer.equalsIgnoreCase("s")) {
                Investimento inv = new Investimento();
                ui.writeln("------------------------");
                inv.setDataInizio(ui.askDate("Data di inizio"));
                inv.setDataTermine(ui.askDate("Data termine"));
                inv.setCapitaleIniziale(ui.askDouble("Capitale iniziale"));
                inv.setTassoAnnuo(ui.askDouble("Tasso Annuale"));
                ui.writeln("Il capitale al termine dell'investimento sara' " + inv.getCapitaleFinale());
                ui.writeln("------------------------");
            }else{
                goAhead=false;
            }
        }

    }
}
