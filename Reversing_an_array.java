package com.company;
public class Reversing_an_array {
    public static void main(String[] args) {

        int [] a = {10,20,30,40,50};

        int l = a.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<n; i++){
            temp = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = temp;

        }
        for(int element:a){
            System.out.println(element);
        }


    }
}
