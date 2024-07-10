package DateTimeAPI;

import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        Year year=Year.of(2023);//for previous year use year.of()
        System.out.println(year.isLeap());
        System.out.println(Year.now().isLeap());//for current year use Year.now()
    }
}
