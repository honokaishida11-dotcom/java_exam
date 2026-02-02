public class Ex03 {

    public static void main(String[] args) {
        
        int year = 1901;
        int numA = 100;

        int numB =  (int) (year / numA);

        if( year % numA == 0 && year < year + 100 ){
            System.out.println(year + "年は" + numB + "世紀です");
        }else if (year % numA != 0 && year > numB * numA) {
            System.out.println(year + "年は" + (numB + 1)  + "世紀です");

        }
    }

}
