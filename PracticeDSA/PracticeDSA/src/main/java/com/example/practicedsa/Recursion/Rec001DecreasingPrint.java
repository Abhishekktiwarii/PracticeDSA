package com.example.practicedsa.Recursion;

public class Rec001DecreasingPrint {
    public static void dec(int i){
        if(i==0)return;
        System.out.print(i+" ");
        dec(i-1);
    }
    public static void main(String[] args) {
        dec(5);
    }

}
