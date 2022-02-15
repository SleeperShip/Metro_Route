class MyLinkedList {
    Node head;
    int size;
   
    class Node {
        String data;
        Node next;
       
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
   
    public String get(int index) {
        if (index < 0 || index >= size) {
            return "";
        }
       
        Node nodeRef = head;
        int n = 0;
       
        while (n < index) {
            nodeRef = nodeRef.next;
            n++;
        }
        return nodeRef.data;
    }
   
    public void addAtHead(String val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
   
    public void addAtTail(String val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
       
        Node newNode = new Node(val);
        Node nodeRef = head;
       
        while (nodeRef.next != null) {
            nodeRef = nodeRef.next;
        }
        nodeRef.next = newNode;
        size++;
    }
   
    public void addAtIndex(int index, String val) {
        if (index < 0 || index > size) {
            return;
        }
       
        if (index == 0) {
            addAtHead(val);
        } else {
            Node newNode = new Node(val);
            Node nodeRef = head;
            int n = 1;
           
            while (n < index) {
                nodeRef = nodeRef.next;
                n++;
            }
           
            Node nextNode = nodeRef.next;
            nodeRef.next = newNode;
            newNode.next = nextNode;
            size++;
        }
    }
   
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
       
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node nodeRef = head;
            int n = 1;
           
            while (n < index) {
                nodeRef = nodeRef.next;
                n++;
            }
            nodeRef.next = nodeRef.next.next;
            size--;
        }
    }
   
    public void printList() {
        Node nodeRef = head;
        int n = 0;
       
        while (nodeRef != null) {
            System.out.println(nodeRef.data);
            nodeRef = nodeRef.next;
        }
    }
}
