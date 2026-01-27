package java_O;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exam5 {

    public static void main(String[] args) {

        
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy年M月d日", Locale.JAPAN);
        LocalDate birthday = LocalDate.of(1998, 7, 18);
        System.out.print("私の誕生日は");
        System.out.println(birthday.format(a) + "です");
    }

}
