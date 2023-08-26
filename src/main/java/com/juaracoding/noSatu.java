package com.juaracoding;

public class noSatu {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println(i+" Bizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i+" Buzz");
            } else if (i % 3 ==0 && i % 5 ==0) {
                System.out.println(i+" BizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}