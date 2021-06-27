package com.company;
import java.util.Scanner;
public class Factorial {

    static int factorial(int x){
        int initial = 1;
        if(x==0 || x==1){
            return 1;
        }
        else{
            for(int i=1; i<=x; i++){

                initial *= i;
            }
            return initial;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("The Factorial of %d is : %d", n,factorial(n));

    }
}
