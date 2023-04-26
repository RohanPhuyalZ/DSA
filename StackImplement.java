public class StackImplement{
    private int []data;
    private int top;
    private int capacity;

    StackImplement(int size){
        data = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Full");
        } else {
            data[++top] = x;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1; // or throw an exception
        } else {
            return data[top--];
        }
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printAll(){
        for(int i = 0; i <= top; i++){
            System.out.print(data[i] + "\t");
        }
    }

    public static void main(String[] args) {
        StackImplement s = new StackImplement(5);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("After Pushing: ");
        s.printAll();
        s.pop();
        s.pop();
        System.out.println("\nAfter popping: ");
        s.printAll();
    }
}
