package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class agePrint {
    public static void main(String[] args) {
       LocalDate DOB=LocalDate.of(1983,04,15);
        LocalDate cdt=LocalDate.now();
        Period p=Period.between(DOB,cdt);
        System.out.println("No of Years:" +p.getYears() + " -No of Months:"  +p.getMonths()+ " -no of days:" +p.getDays());

    }
}
