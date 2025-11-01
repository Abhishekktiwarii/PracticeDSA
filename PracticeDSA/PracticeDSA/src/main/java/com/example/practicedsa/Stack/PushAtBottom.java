package com.example.practicedsa.Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void bottom(int i, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(i);
            return;
        }
        int top = stack.pop();
        bottom(i,stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        bottom(15,st);
        while (!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
