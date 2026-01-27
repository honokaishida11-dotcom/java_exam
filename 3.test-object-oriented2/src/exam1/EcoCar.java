package exam1;

public class EcoCar extends Car{

    // protected String name = "プリウス";

    EcoCar(String name){

        this.name = name;

    }

    @Override
    public void run(){
        System.out.println("シーン!" + name + "が走ります");

    }

}
