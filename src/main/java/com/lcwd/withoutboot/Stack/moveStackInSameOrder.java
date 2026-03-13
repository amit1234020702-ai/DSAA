package com.lcwd.withoutboot.Stack;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    static void main(String[] args) {
                         //Qsn=01->print same stack
//        Scanner sc=new Scanner(System.in);
//
//        Stack<Integer> st=new Stack<>();
//        int n;
//        System.out.println("Enter the number elements");
//        n=sc.nextInt();
//        System.out.println("Enter the elements :");
//        for(int i=1;i<=n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);



        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //Qsn 02-> reverse stack
        //reverse
     //   Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            int x=st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(rt);
//       ->>>   second method
//        while(st.size()>0){
//            rt.push(st.pop());
//       }
//       System.out.println(rt);

        //qsn->03 useing other stack to print same order
Stack<Integer> gt=new Stack<>();
while(st.size()>0){
    gt.push(st.pop());

}
        Stack<Integer> rt=new Stack<>();
while(gt.size()>0){
    rt.push(gt.pop());
}
System.out.println(rt);






    }
}
