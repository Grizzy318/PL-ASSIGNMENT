class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

Node insert(Node head, int val) {
    Node n = new Node(val);
    n.next = head;
    return n;
}

Node delete(Node head, int val) {
    if (head == null) return null;
    if (head.data == val) return head.next;

    Node cur = head;
    while (cur.next != null && cur.next.data != val)
        cur = cur.next;

    if (cur.next != null)
        cur.next = cur.next.next;

    return head;
}

boolean search(Node head, int val) {
    Node cur = head;
    while (cur != null) {
        if (cur.data == val) return true;
        cur = cur.next;
    }
    return false;
}
