public class MyQueue {
    private int[] arr;
    private int front;
    private int rear;

    public MyQueue(int s){
        this.arr = new int[s];
        this.rear = 0;
        this.front = 0;
    }

    public void enQueue(int value){
        if(this.rear == this.arr.length - 1){
            System.out.println("Queue is Full");
        }
        this.arr[this.rear++] = value;
    }
}
