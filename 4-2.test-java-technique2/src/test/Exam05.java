package test;

public class Exam05 {

    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("アナと雪の女王",3000);
        cart.addItem("美女と野獣",2000);
        cart.addItem("モアナと伝説の海",8000);

        System.out.println("合計値：" + cart.getTotalPrice());
         System.out.println("平均値：" + cart.getAveragePrice());
    }

}
