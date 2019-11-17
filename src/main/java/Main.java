import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i <10 ; i++){
            DayOfWeek dotw = LocalDate.of(Year.now().getValue() - i, Month.APRIL, 26).getDayOfWeek();
            System.out.println("My birthday in " + (Year.now().getValue() - i) + " was on a " + dotw.name());
        }


        for(int i = 0; i < 10 ; i++){

            LocalDate birthday1 = LocalDate.of(Year.now().getValue() - i, Month.APRIL, 26);
            LocalDate birthday2 = LocalDate.of((Year.now().getValue() - (i+1)) , Month.APRIL, 26);

            long daysDifference = ChronoUnit.DAYS.between(birthday2, birthday1);
            System.out.println("Number of days between my birthday in year " +  (Year.now().getValue() - i) + " and " +  (Year.now().getValue() - (i+1)) + " is " + daysDifference);
        }

    }
}
