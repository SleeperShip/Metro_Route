class MyLinkedList {
    Node head;
    Node tail;
    int size;
    
    class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }
    }
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        Node nodeRef = head;
        int n = 0;
        
        while (n < index) {
            nodeRef = nodeRef.next;
            n++;
        }
        return nodeRef.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        
        if (head == null) {
            addAtHead(val);
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        if (index == size) {
            addAtTail(val);
            return;
        }
        
        Node nodeRef = head;
        Node newNode = new Node(val);
        
        while (index > 1 && nodeRef != null) {
            nodeRef = nodeRef.next;
            index--;
        }
        
        newNode.next = nodeRef.next;
        nodeRef.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        
        Node nodeRef = head;
        int n = 1;
        
        while (n < index && nodeRef != null) {
                nodeRef = nodeRef.next;
                n++;
        }
        
        nodeRef.next = nodeRef.next.next;
        if (nodeRef.next == null) {
            tail = nodeRef;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
