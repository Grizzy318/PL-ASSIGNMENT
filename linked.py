class Node:
    def _init_(self, data):
        self.data = data
        self.next = None

def insert(head, val):
    n = Node(val)
    n.next = head
    return n

def delete(head, val):
    if not head: 
        return head
    if head.data == val:
        return head.next
    cur = head
    while cur.next and cur.next.data != val:
        cur = cur.next
    if cur.next:
        cur.next = cur.next.next
    return head

def search(head, val):
    cur = head
    while cur:
        if cur.data == val:
            return True
        cur = cur.next
    return False
