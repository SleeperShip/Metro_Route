class MyLinkedList {
    
    Node sentHead;
    Node sentTail;
    String listLine;
    int size;
   
    public MyLinkedList() {
        sentHead = new Node(0);
        sentTail = new Node(0);
        sentHead.next = sentTail;
        sentHead.prev = null;
        sentTail.prev = sentHead;
        sentTail.next = null;
        this.size = 0;
    }
   
    class Node {
        Node next;
        Node prev;
        String stationName;
        String lineName;
       
        public Node(Node prevNode, Node nextNode, String station, String line) {
            this.next = nextNode;
            this.prev = prevNode;
            this.stationName = station;
            this.lineName = line;
        }
       
        public Node(String station, String line) {
            this.stationName = station;
            this.lineName = line;
        }
    }
   
    public Node getNode(int index) {
        Node currentNode = sentHead;
       
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    
    public void addBetween(Node prevNode, Node nextNode, String station, String line) {
        Node newNode = new Node(prevNode, nextNode, station, line);
        prevNode.next = newNode;
        nextNode.prev = newNode;
        size++;
    }

    public int getStationName(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return getNode(index).stationName;
    }
    
    public void addAtHead(String station, String line) {
        addBetween(sentHead, sentHead.next, station, line);
    }
   
    public void addAtTail(String station, String line) {
       addBetween(sentTail.prev, sentTail, val);
    }
   
    public void addAtIndex(int index, String station, String line) {
       if (index < 0 || index > size) {
           return;
       }
        
       if (index == size) {
           addAtTail(String station, String line);
           return;
       } 
        
       Node existingNode = getNode(index);
       addBetween(existingNode.prev, existingNode, String station, String line); 
    }
   
    public void deleteAtIndex(int index) {
       if (index < 0 || index >= size) {
           return;
       } 
        
       Node nodeToDelete = getNode(index);
       Node previousNode = nodeToDelete.prev;
       Node nextNode = nodeToDelete.next;
       previousNode.next = nextNode;
       nextNode.prev = previousNode;
       nodeToDelete.next = null;
       nodeToDelete.prev = null;
       size--;    
    }
    
    public String getListLine() {
        return this.listLine;
    }
}
