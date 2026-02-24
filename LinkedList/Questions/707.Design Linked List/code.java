class MyLinkedList {
    private class Node{
        int value;
        Node next;   
        public Node(int value) {    
            this.value = value;
       }
        public Node(int value, Node next) {
            this.value = value;
           this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;   
        for (int i = 0; i < index; i++) {  
            temp = temp.next;
        }
        return temp.value;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(size == 0){
            tail = head;
        }

        size++;
    }
    
    public void addAtTail(int val) {
        if(size == 0){
            addAtHead(val);
            return;   
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {   
            temp = temp.next;
        }
        Node node = new Node(val); 
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (index == size - 1) {
            tail = temp;
        }
        size--;
    }

}
