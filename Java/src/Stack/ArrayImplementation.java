package Stack;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[1];
        private int idx = 0;
        private int size = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
            size++;
        }

        int peak(){
            if(size==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(size==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            size--;
            return top;
        }
        int size(){
            return size;
        }
        void display(){
            for (int i = 0 ; i<=idx-1 ; i++){
                System.out.println(arr[i]);
            }
        }
        boolean isEmpty(){
            return size==0;
        }
        boolean isFull(){
            if(size==arr.length)return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(30);
        stack.display();
        System.out.println(stack.size());

    }
}
