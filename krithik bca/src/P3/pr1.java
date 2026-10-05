package P3;

import java.util.Stack;

public class pr1 {
    int stack[]=new int[5];
    int top=-1;
    void push(int data){
        if(top==stack.length-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    int peak(){
        if(top==-1){
            System.out.println("empty");
            return-1;
        }
        int value=stack[top];
        return value;

    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        pr1 s= new pr1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.push(60);
        s.display();
        System.out.println("removed"+s.pop());
        System.out.println("peak"+s.peak());

    }
}
