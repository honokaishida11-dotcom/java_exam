public class Ex04 {


    public static void main(String[] args) {
        
        int year = 2000;

        if(year % 4 == 0){
            System.out.println(year  + "年はうるう年です");
        }else if(year  % 100 == 0 && year  % 400 == 0){
            System.out.println(year  + "年はうるう年です");
        }else if (year  % 100 == 0){
            System.out.println(year  + "年はうるう年ではありません");
        }else{
            System.out.println("うるう年ではありません");
        }
    }

    /*public static void main(String[] args) {

        
       year(2000);
    }

        public boolean year(int num){
        if(num % 4 == 0){
            return true;
        }else if(num % 100 == 0 && num % 400 == 0){
            return true ;
        }else if (num % 100 == 0){
            return false;
        }else{
            return false;
        }   
    
    
    }*/
}
