package test;

import java.util.HashMap;
import java.util.Map;

public class Exam4 {

    public static void main(String[] args) {
        
        Map<String,String> prefMap = new HashMap<>();

        prefMap.put("東京","東京");
        prefMap.put("埼玉","さいたま");
        prefMap.put("茨城","水戸");
        prefMap.put("沖縄","那覇");

        String saitama = prefMap.get("埼玉");
        System.out.println("埼玉の県庁所在地は「" + saitama + "」です");

        String okinawa = prefMap.get("沖縄");
        System.out.println("沖繩の県庁所在地は「" + okinawa  + "」です");
    }

}
