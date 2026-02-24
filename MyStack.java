public class MyStack {
    private int top;
    private int[] arr;

    public MyStack(int s){
        this.top = -1;
        this.arr = new int[s];
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        this.arr[++this.top] = value;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return this.arr[this.top--];
    }

    public void peek(){
        if(isEmpty()){
            return;
        }
        System.out.println(this.arr[this.top]);
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.top == (this.arr.length - 1));
    }
}
