package exam1;

public class Car {

    protected String name;

    Car(){
        
    }

    public void putOnGas(){
        System.out.println( name + "に給油します");
    }

    public void run(){
        System.out.println("ブーン!車が走ります");
    }

}
