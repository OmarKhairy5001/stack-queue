public class MyStack {
    private int top;
    private int[] arr;
    private int size;

    public MyStack(int s){
        this.top = -1;
        this.arr = new int[s];
        this.size = 0;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        this.arr[++this.top] = value;
        this.size++;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        this.size--;
        return this.arr[this.top--];
    }

    public void peek(){
        if(isEmpty()){
            return;
        }
        System.out.println(this.arr[this.top]);
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
