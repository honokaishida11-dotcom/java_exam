package src;

public class Exam3 {

    static void viewName(int num1){
        String name = "石田穂野歌";

        for(int i = 1 ; i <= num1 ; i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        viewName(3);
    }

}
