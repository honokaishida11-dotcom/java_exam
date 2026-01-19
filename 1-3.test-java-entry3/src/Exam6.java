package src;

public class Exam6 {

    static int calc(int num1, int num2 , char a){

        if ( a != '+'){
            return -1;
        }else if( a != '-'){
            return -1;
        }else if ( a != '*'){
            return -1;
        }else if ( a != '/'){
            return -1;
        }else{
            return num1 + (a) + num2;
        }

        
    }


    public static void main(String[] args) {
        System.out.println(calc(2,3,'+'));
    }
}
