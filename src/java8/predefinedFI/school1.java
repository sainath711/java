package java8.predefinedFI;
public class school1 {
    public static void main(String[] args) {
        UniAdmissions s=(college,year,whc)->college+year+whc;
        System.out.println(s.calc("SAT",2024,01));

    }
}
