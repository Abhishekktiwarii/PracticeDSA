package com.example.practicedsa.backtracking;

public class PermutationABC {

    public static void printPermutation(String str, String perm, int idx){

        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, perm+ch, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str,"",0);
    }
}
