import java.util.*;

class BST
{
    BSTNode root;
    
    BST()
    {
        root = null;
    }
    
    BSTNode Insert(BSTNode ptr, int n)
    {
        if (ptr == null)
        {
            ptr = new BSTNode(n);
        }
        else
        {
            if (n <= ptr.data)
                ptr.left = Insert(ptr.left, n);
            else
                ptr.right = Insert(ptr.right, n);
        }
        return ptr;
    }
    
    void Display(BSTNode ptr)
    {
        if (ptr == null)
            return;
        Display(ptr.left);
        System.out.print(ptr.data + "\t");
        Display(ptr.right);
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        BST B = new BST();
        System.out.println("1. Insert\n 2. Display\n 3. Quit");
        int ch;
        do
        {
            System.out.println("Make choice:");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter element:");
                    int x = sc.nextInt();
                    B.root = B.Insert(B.root, x);
                    break;
                case 2:
                    B.Display(B.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid; Choose again");
            }
        } while (ch != 3);
    }
}