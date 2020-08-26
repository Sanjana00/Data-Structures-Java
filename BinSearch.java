import java.util.*;

class BinSearch
{
    Node front, rear;
    
    BinSearch()
    {
        front = null;
        rear = null;
    }
    
    void Insert(int n)
    {
        Node N = new Node(n);
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
    
    Node middleNode(Node start, Node end)
    {
        if (start == null)
            return null;
        Node slow = start;
        Node fast = start.next;
        while (fast != end)
        {
            if (fast != end)
            {
                slow = slow.next;
                fast = fast.next;
            }
            if (fast != end)
                fast = fast.next;
        }
        return slow;
    }
    
    Node Search(int value)
    {
        Node start = front;
        Node end = null;
        
        do
        {
            Node m = middleNode(start, end);
            if (m == null)
                return null;
            if (m.n == value)
                return m;
            if (m.n < value)
                start = m.next;
            if (m.n > value)
                end = m;
        } while (end == null || end != start);
        
        return null;
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        BinSearch L = new BinSearch();
        System.out.println("1. Insert\n 2. Search\n 3. Display\n 4. Quit");
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
                    L.Insert(x);
                    break;
                case 2:
                    System.out.println("Enter search item:");
                    int a = sc.nextInt();
                    Node N = L.Search(a);
                    if (N == null)
                        System.out.println("Element not found");
                    else
                        System.out.println("Element found in list");
                    break;
                case 3:
                    L.Display();
                    break;
                case 4:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid: Choose again");
            }
        }while (ch != 4);
    }
}