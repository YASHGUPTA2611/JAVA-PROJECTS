package com.company;
import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of 5 is : " + factorial(a));


    }
}
