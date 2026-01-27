package java_O;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exam6 {

    public static void main(String[] args) {

    
        //DateTimeFormatter a =
                //DateTimeFormatter.ofPattern("yyyy-MM-dd日", Locale.JAPAN);

       
        LocalDateTime hideyosiDate = LocalDateTime.of(1543, 02, 10,05,12);
        System.out.print("徳川家康の誕生日は");
        System.out.println(hideyosiDate + "です");

            System.out.println();

        LocalDateTime b = LocalDateTime.of(1543, 02, 10,05, 12);

        LocalDateTime a = b
            .plusYears(1)
            .plusMonths(2)
            .plusDays(3)
            .plusHours(4)
            .plusMinutes(5);
            

            System.out.println("1年2ヶ月3日4時間5分後は" + a + " です");
        }

        


       
    }
        

    
