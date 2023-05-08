import java.time.LocalDate;
import java.util.Scanner;

public class TerminalUI {

    private Scanner in;

    public TerminalUI(){
        this.in=new Scanner(System.in);
    }

    public void write(String str){
        System.out.print(str);
    }

    public void writeln(String str){
        System.out.println(str);
    }

    public String read(){
        return in.nextLine();
    }

    public String askStirng(String label){
        write(label);
        write(": ");
        return read();
    }

    public double askDouble(String label){
        return Double.parseDouble(askStirng(label));
    }

    public int askInt(String label){
        return Integer.parseInt(askStirng(label));
    }

    public LocalDate askDate(String label){
        String strDate=askStirng(label);
        return LocalDate.parse(strDate);
    }


}
