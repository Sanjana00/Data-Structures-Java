import java.util.*;

class Queue
{
    Node front, rear;
    int size;
    Queue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    
    void Insert(int n)
    {
        Node N = new Node(n);
        size++;
        if (front == null)
        {
            front = N;
            rear = front;
        }
        else
        {
            rear.next = N;
            rear = rear.next;
        }
    }
    
    void Delete()
    {
        if (front == null)
        {
            System.out.println("List empty");
            return;
        }
        size--;
        System.out.println("Deleted item: " + front.n);
        front = front.next;
        if (front == null)
            rear = null;
    }
    
    void Display()
    {
        if (front == null)
            System.out.print("List empty");
        Node ptr = front;
        while (ptr != null)
        {
            System.out.print(ptr.n + "\t");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Queue Q = new Queue();
        System.out.println("1. Insert\n 2. Delete\n 3. Display\n 4. Display Size\n 5. Quit");
        int ch;
        do
        {
            System.out.println("Make choice:");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter item:");
                    int x = sc.nextInt();
                    Q.Insert(x);
                    break;
                case 2:
                    Q.Delete();
                    break;
                case 3:
                    Q.Display();
                    break;
                case 4:
                    System.out.println("Size of queue is " + Q.size);
                    break;
                case 5:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid: Choose again");
            }
        }while (ch != 5);
    }
}