public class Exam6 {
    public static void main(String[] args) {

    /*正しい解答　（スペースを入れる）
    for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                int calcNum = i * j;
                if(calcNum < 10) {
                    System.out.print(" " + calcNum + " ");
                }else {
                    System.out.print(calcNum + " ");
                }
            }
            System.out.println();
        } */

    for(int i = 1 ; i <= 9 ; i++){

        for(int j = 1 ; j <= 9 ; j++){
            int num = i * j;

            if(num < 10 ){
            System.out.print(" " + num + " ");
        }else{
            System.out.print(num + " ");
        }
    }
        System.out.println();
    }

}

}
