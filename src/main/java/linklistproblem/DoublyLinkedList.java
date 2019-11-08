package linklistproblem;


public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data; //can be generics
        private ListNode next;
        private ListNode previous;

        public  ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private int getLength(){
        return length;
    }

    private boolean isEmpty(){
        return length == 0;
    }

    private void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.data+" --->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while (temp != null){
            System.out.println(temp.data+" --->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    private void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertLast(1);
        doublyLinkedList.insertLast(2);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insertLast(4);
        doublyLinkedList.insertLast(5);
        doublyLinkedList.displayBackward();
        doublyLinkedList.displayForward();
    }
}
