import java.time.LocalDate;

public class Starter {

    public static void main(String[] args) {

        TerminalUI ui =new TerminalUI();
        InvestimentoAgent agent=new InvestimentoAgent(ui);
        agent.run();

    }
}
