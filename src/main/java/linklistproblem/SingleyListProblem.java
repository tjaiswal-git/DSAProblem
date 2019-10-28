package linklistproblem;

public class SingleyListProblem {

    private ListNode head;

    private static class ListNode {
        private int data; //generics type
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * this method is used for getting linklist element
     */
    private void display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * this method is used for return length of linklist
     *
     * @return length
     */
    private int length() {
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * this method is used for insertion element in first (head)
     *
     * @param value is the element which you want to insert in list
     */
    private void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        System.out.println("element is inserted " + value + " on beginning of linklist");

    }

    public static void main(String[] args) {
        SingleyListProblem singleyListProblem = new SingleyListProblem();
        singleyListProblem.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        //now will connect in chain
        singleyListProblem.head.next = second;
        second.next = third;
        third.next = forth;
        singleyListProblem.display();
        System.out.println("length of singly linklist " + singleyListProblem.length());
        singleyListProblem.insertFirst(50);
        singleyListProblem.insertFirst(60);
        singleyListProblem.display();
        System.out.println("length of singly linklist " + singleyListProblem.length());

    }
}
