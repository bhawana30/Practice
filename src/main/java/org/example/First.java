package org.example;

public class First {

    public static void main(String args []){
        System.out.println("First Class");
        for(int i =0; i<5; i++){
            System.out.println("Print value of i :" + i);
            System.out.println("In main");
            i--;
        }
    }

}
