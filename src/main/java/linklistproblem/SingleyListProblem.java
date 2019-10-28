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
     * this method is used for getting linklist elements
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
     * Note:
     * time complexity of insertFirst is O(1)
     * space complexity of insertFirst is O(1)
     *
     * @param value is the element which you want to insert in list
     */
    private void insertAtFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        System.out.println("element is inserted " + value + " on beginning of linklist");

    }

    /**
     * this method is used for insertion element in last(head=null)
     * Note:
     * time complexity of insertAtLast is O(n)
     * space complexity of insertAtLast is O(n)
     *
     * @param value is the element which you want to insert in list
     */
    private void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode tempCurrent = head;
        while (null != tempCurrent.next) {
            tempCurrent = tempCurrent.next;
        }
        tempCurrent.next = newNode;
        System.out.println("element is inserted " + value + " at end of linklist");
    }

    /**
     * this method is used for search a element in linklist
     * Note:
     * time complexity of searchElement is O(n) in worst case
     *
     * @param searchKey ,to search a key
     * @return based on the search operation true or false
     */
    private boolean searchElement(int searchKey) {
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                System.out.println("Search key is found " + searchKey);
                return true;
            }
            current = current.next;
        }
        System.out.println("search key is not found " + searchKey);
        return false;
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

        singleyListProblem.insertAtFirst(50);
        singleyListProblem.insertAtFirst(60);
        singleyListProblem.display();
        System.out.println("length of singly linklist " + singleyListProblem.length());

        singleyListProblem.insertAtLast(70);
        singleyListProblem.display();
        System.out.println("length of singly linklist " + singleyListProblem.length());

        singleyListProblem.insertAtLast(80);
        singleyListProblem.display();
        System.out.println("length of singly linklist " + singleyListProblem.length());

        System.out.println(singleyListProblem.searchElement(30));
        System.out.println(singleyListProblem.searchElement(1000));
    }
}
