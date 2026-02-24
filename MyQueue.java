public class MyQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int s){
        this.arr = new int[s];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        this.arr[this.rear++] = value;
        this.size++;
    }

    public int deQueue(){
        if(isEmpty()){
            return -1;
        }
        this.size--;
        return this.arr[this.front++];
    }

    public int peek(){
        return this.arr[this.front];
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public boolean isFull(){
        return (this.size == this.arr.length);
    }
}
