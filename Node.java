class Node
{
    int n;
    Node next;
    Node()
    {
        n = 0;
        next = null;
    }
    Node(int n)
    {
        this.n = n;
        next = null;
    }
    public Node GetNode(int i)
    {
        Node N = new Node();
        N.n = i;
        return N;
    }
}