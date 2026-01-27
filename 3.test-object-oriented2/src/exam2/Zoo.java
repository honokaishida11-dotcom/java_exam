package exam2;

public class Zoo {

    public static void main(String[] args) {
        
        Animal[] animals = new Animal[3];

        animals[0] = new Sheep();
        animals[1] = new Horse();
        animals[2] = new Goat();


        for(Animal animal : animals){
            animal.cry();
        }

    }

}
