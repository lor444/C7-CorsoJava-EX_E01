import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class Investimento {

    private LocalDate dataInizio;
    private LocalDate dataTermine;
    private double capitaleIniziale;
    private double tassoAnnuo;

    public Investimento(){
        this.dataInizio=null;
        this.dataTermine=null;
        this.capitaleIniziale=0;
        this.tassoAnnuo=0;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataTermine() {
        return dataTermine;
    }

    public void setDataTermine(LocalDate dataTermine) {
        this.dataTermine = dataTermine;
    }

    public double getCapitaleIniziale() {
        return capitaleIniziale;
    }

    public void setCapitaleIniziale(double capitaleIniziale) {
        this.capitaleIniziale = capitaleIniziale;
    }

    public double getTassoAnnuo() {
        return tassoAnnuo;
    }

    public void setTassoAnnuo(double tassoAnnuo) {
        this.tassoAnnuo = tassoAnnuo;
    }

    public double getCapitaleFinale(){
        LocalDateTime dtA = getDataInizio().atStartOfDay();
        LocalDateTime dtB = getDataTermine().atStartOfDay();
        Duration p = Duration.between(dtA,dtB);
        long days = p.toDays();
        double years = days / 365.0;
        double tassoComplessivoSemplificato = getTassoAnnuo() * years;
        double interessi = capitaleIniziale / 100 * tassoComplessivoSemplificato;
        return capitaleIniziale + interessi;
    }


}
