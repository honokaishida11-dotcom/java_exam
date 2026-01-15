public class Exam3 {
    public static void main (String[] args){
        int item1Price = 200;
        int item1Count = 3;

        int item2Price = 250;
        int item2Count = 4;

        int subTotal = item1Price * item1Count
                     + item2Price * item2Count ;
        
        int tax = subTotal * 10 /100;

        int total = subTotal + tax ;

        System.out.println("小計");
        System.out.println(subTotal + "円");
        System.out.println("消費税");
        System.out.println(tax + "円");
        System.out.println("合計金額");
        System.out.println(total + "円");

    }

}
