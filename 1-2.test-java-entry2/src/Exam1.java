public class Exam1 {
    public static void main(String[] args) {

        /*正しい解答
        if(totalScore >= 0 && totalScore < 80) {
            System.out.println("追試です");
        } else if(totalScore >= 80 && totalScore < 100) {
            System.out.println("合格です");
        } else if(totalScore == 100) {
            System.out.println("満点です");
        } else {
            System.out.println("存在しない点数です");
        } */

        // 石田の解答
        int totalScore = 101;

        if(totalScore <= 79){
            System.err.println("追試です");
        }else if(totalScore <= 99){
            System.out.println("合格です");
        }else if(totalScore == 100){
            System.out.println("満点です");
        }else{
            System.out.println("存在しない点数です");
        }
        

    }

}
