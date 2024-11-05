package org.example;

public class First {

    public static void main(String args []){
        System.out.println("First Class");
        int y=0;
        for(int i =0; i<5; i++){
            System.out.println("Value of i is :" + y);
            System.out.println("In master");
            i--;
        }
    }

}
