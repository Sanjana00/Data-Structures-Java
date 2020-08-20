import java.util.*;

class Stack
{
    Node top;
    Stack()
    {
        top = null;
    }
    
    void Push(int n)
    {
        Node N = new Node(n);
        N.next = top;
        top = N;
    }
    
    void Pop()
    {
        if (top == null)
            System.out.println("Stack empty");
        else
        {
            System.out.println("Popped element is: " + top.n);
            top = top.next;
        }
    }
    
    void Display()
    {
        Node head = top;
        if (head == null)
            System.out.print("Stack empty");
        while (head != null)
        {
            System.out.print(head.n + "\t");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Stack S = new Stack();
        int ch;
        System.out.println("1. Push \n2. Pop \n3. Display \n4. Quit");
        do
        {
            System.out.println("Make choice:");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter item");
                    int x = sc.nextInt();
                    S.Push(x);
                    break;
                case 2:
                    S.Pop();
                    break;
                case 3:
                    S.Display();
                    break;
                case 4:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid: Please choose again");
            }
        }while (ch != 4);
    }
}