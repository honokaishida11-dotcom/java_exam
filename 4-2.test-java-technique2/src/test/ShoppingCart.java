package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ShoppingCart extends LinkedList {

    protected ArrayList<Item> itemList;

     public ShoppingCart(Item item){
        itemList = new ArrayList<>();

    }

    public ShoppingCart(){

    }

   public int getTotalPrice(){
    int total = 0;
    for(Item item : itemList){
        total += getTotalPrice();
    }
    return total;
   }

   public int getAveragePrice(){
     if(itemList.isEmpty()){
        return 0;
     }
     return getTotalPrice() / itemList.size();

   }

   public void addItem(Item item){
        itemList.add(item);
    }

   public void addItem(String string, int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addItem'");
   }



}
