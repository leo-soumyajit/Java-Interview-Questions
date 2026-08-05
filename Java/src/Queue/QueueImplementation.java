package Queue;

public class QueueImplementation {
    static class Queue{
        int front = -1;
        int rear = -1;
        int size =0;
        int[] arr = new int[10];

        void add(int x){
            if(rear== arr.length-1){
                System.out.println("Queue limit reached");
                return;
            }
            if(front==-1 && rear == -1){
                front=0;
                rear=0;
                arr[rear]=x;
                size++;
            }else{
                arr[rear+1]=x;
                rear++;
                size++;
            }

        }
        int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int ans = arr[front];
            front++;
            size--;
            return ans;
        }
        int peak(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        void display(){
            for (int i = front ; i<=rear ; i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();
        queue.remove();
        System.out.println("Peak Element "+queue.peak());
        queue.display();

    }
}
