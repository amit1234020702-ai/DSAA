package com.lcwd.withoutboot.Stack;

import java.util.Stack;

// reverse stack by recursive
public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.println(top+"");
        displayReverseRec(st);
        st.push(top);

    }

    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();

        displayRec(st);
        System.out.println(top+"");
        st.push(top);

    }



    static void main(String[] args) {


        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       // displayReverseRec(st);
        displayRec(st);

//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//
//        }
//        while(rt.size()>0){
//            int x=rt.pop();
//            System.out.println(x+"");
//            st.push(x);
//        }
        //System.out.println(st);


        //by the array
//        int n=st.size();
//        int [] arr=new int[n];
//        for(int i=n-1;i>=0;i--){
//
//            arr[i]=st.pop();
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]+"");
//            st.push(arr[i]);
//        }
    }
}
