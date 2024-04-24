package java8.predefinedFI;

public class school implements UniAdmissions{
    @Override
    public String calc(String college, int year, int whc) {
        return college+year+whc;
    }

    public static void main(String[] args) {
         UniAdmissions s=new school();
        System.out.println(s.calc("SAT",2024,001));
        System.out.println(s.calc("SAT",2024,02));
        System.out.println(s.calc("SAT",2024,03));
    }
}
