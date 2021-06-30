package com.company;
import java.util.Scanner;
public class Fibonacci_series {

    static int fib(int n){
        if(n==1 || n==2 ){

            return n-1;

        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int c = fib(input);
        System.out.println(c);

    }
}
