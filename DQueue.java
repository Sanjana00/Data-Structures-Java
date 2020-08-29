;import java.util.*;

class DQueue
{
    DNode front;
    DNode rear;
    int size;
    DQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    
    void Insert_Front(int n)
    {
        DNode D = new DNode(n);
        size++;
        if (front == null)
        {
            front = D;
            rear = D;
            return;
        }
        front.prev = D;
        D.next = front;
        front = D;
    }
    
    void Insert_Back(int n)
    {
        DNode D = new DNode(n);
        size++;
        if (front == null)
        {
            front = D;
            rear = D;
            return;
        }
        rear.next = D;
        D.prev = rear;
        rear = D;
    }
    
    void Delete_Front()
    {
        if (front == null)
        {
            System.out.println("Empty queue");
            return;
        }
        size--;
        if (front == rear)
        {
            System.out.println("The deleted element is " + front.data);
            front = null;
            rear = null;
            return;
        }
        System.out.println("The deleted element is " + front.data);
        front = front.next;
        front.prev.next = null;
        front.prev = null;
    }
    
    void Delete_Back()
    {
        if (front == null)
        {
            System.out.println("Empty queue");
            return;
        }
        size--;
        if (front == rear)
        {
            System.out.println("The deleted element is " + front.data);
            front = null;
            rear = null;
            return;
        }
        System.out.println("The deleted element is " + rear.data);
        rear = rear.prev;
        rear.next.prev = null;
        rear.next = null;
    }
    
    void Display()
    {
        if (front == null)
        {
            System.out.println("Empty Queue");
            return;
        }
        DNode D = front;
        while (D != null)
        {
            System.out.print(D.data + "\t");
            D = D.next;
        }
        System.out.println();
    }
    
    void Display_Reverse()
    {
        if (front == null)
        {
            System.out.println("Empty Queue");
            return;
        }
        DNode D = rear;
        while (D != null)
        {
            System.out.print(D.data + "\t");
            D = D.prev;
        }
        System.out.println();
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        DQueue DQ = new DQueue();
        System.out.println("1. Insert front\n 2. Insert back\n 3. Delete front\n 4. Delete back\n 5. Display\n 6. Display Reverse\n 7. Display Size\n 8. Quit");
        int ch, x;
        do
        {
            System.out.println("Make choice:");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    System.out.println("Enter element: ");
                    x = sc.nextInt();
                    DQ.Insert_Front(x);
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    x = sc.nextInt();
                    DQ.Insert_Back(x);
                    break;
                case 3:
                    DQ.Delete_Front();
                    break;
                case 4:
                    DQ.Delete_Back();
                    break;
                case 5:
                    DQ.Display();
                    break;
                case 6:
                    DQ.Display_Reverse();
                    break;
                case 7:
                    System.out.println("Size of queue: " + DQ.size);
                    break;
                case 8:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again");
            }
        } while (ch != 8);
    }
}