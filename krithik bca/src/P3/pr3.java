package P3;

public class pr3 {
    int front;
    int queue[];
    int rear;
    int capacity;
    public pr3(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
    }
    void add(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = data;
    }
    int poll()
    {
        if(front>rear)
        {
            System.out.println("Queue is empty");
        }
        int value= queue[front];
        front++;
        return value;
    }
    int peek(){

        if(front>rear){
            System.out.println("queue is empty");
}
        int value=queue[front];
        return value;
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pr3 q=new pr3(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
        q.display();
        q.add(60);
        System.out.println("removed"+q.poll());
        System.out.println("peak"+q.peek());

    }
}
