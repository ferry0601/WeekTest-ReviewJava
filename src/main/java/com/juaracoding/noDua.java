package com.juaracoding;

public class noDua {
    public static void main(String[] args) {
        int count = 9;
        for (int i=1; i<=5;i++){
            for (int j=i; j<=count; j++){
                if (j % 2 == 1){
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            count--;
            System.out.println();
        }
    }
}
