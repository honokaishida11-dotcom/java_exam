public class Car {

    int speed;

    void run(){
       

        speed += 50;
        System.out.println("走りました。スピードが" + speed + "km/hになりまし た。");

         if(speed >= 120 ){
        System.out.println("スピードの出しすぎです");
    }
    }

    

}
