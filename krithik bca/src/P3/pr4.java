package P3;

public class pr4{
        int front;
        int queue[];
        int rear;
        int capacity;
        int size;
        public pr4(int capacity){
            this.capacity=capacity;
            queue=new int[capacity];
            front=0;
            rear=-1;
            size=0;
        }
        void add(int data) {
            if (rear == capacity - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear=(rear+1)%capacity;
            queue[rear] = data;
            size++;
        }
        int poll()
        {
            int value=queue[front];
            front=(front+1)%capacity;
            size--;
            return value;
        }
        int peek()
        {
        if(front>rear){
            System.out.println("queue is empty");
        }
        int value=queue[front];
        return value;
        }
        void display(){
        for(int i=0;i<=capacity-1;i++){
            System.out.print(queue[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pr4 q=new pr4(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
        q.display();
        System.out.println("removed"+q.poll());
        q.display();
        q.add(60);



    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')' && ch top !='('){
                    return false;
                }

                if(ch==']'&& top!='['){
                    return false;

                }
                if(ch=='}'&&top!='{'){

                    return false;
                }
            }



        }
    }




}
