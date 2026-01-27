package test;

import java.util.ArrayList;

public class Exam2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("後藤");
        names.add("山田");
        names.add("佐藤");
        names.add("田中");

        names.remove(0);

        for(String name : names){
            System.out.println(name);
        }

    }

}
