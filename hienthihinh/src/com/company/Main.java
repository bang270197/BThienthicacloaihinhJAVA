package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
	         for (int j=0;j<7;j++){
                 System.out.print("*"+"\t");
             }
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        int s=1;
        for (int k=0;k<5;k++){
            for (int x=0;x<s;x++){
                System.out.print("*"+"\t");
            } s++;
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        int u=5;
        for (int k=0;k<5;k++){
            for (int x=0;x<u;x++){
                System.out.print("*"+"\t");
            } u--;
            System.out.print("\n");
        }
        System.out.print("\n\n\n");
        for(int t=1;t<=5;t++)
        {
            for(int f=1;f<=5-t;f++)
                System.out.print(" ");
            for(int d=1;d<=2*t-1;d++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
