public class MyStack {
    private int top;
    private int[] arr;

    public MyStack(int s){
        this.top = -1;
        this.arr = new int[s];
    }

    public void push(int value){
        if(this.top == this.arr.length){
            System.out.println("Stach is Full");
            return;
        }
        this.arr[++this.top] = value;
    }

    public int pop(){
        if(this.top == -1){
            return -1;
        }
        return this.arr[this.top--];
    }

    public void peek(){
        if(this.top == -1){
            return;
        }
        System.out.println(this.arr[this.top]);
    }
}
