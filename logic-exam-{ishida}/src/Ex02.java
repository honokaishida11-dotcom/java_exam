import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {


    public static void main(String[] args) {
        
        //ワカラナイココ飛ばしちゃってマオちゃん
    LocalTime localTime = LocalTime.of(11,59,59);
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh時MM分ss秒");
    //System.out.println(localTime.formatter);
        System.out.print(localTime + "の1秒後は");

    localTime.plusMinutes(1);
        System.out.print(localTime + "です");

    //DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh時MM分ss秒");
    //System.out.println(localTime.formatter2 + "です");

    

    
    
}

}
