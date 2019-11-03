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
     * space complexity of insertAtLast is O(1)
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

    /**
     * this method is used to reverse a linklist
     * Note:
     * time complexity of reverse is O(n) in worst case
     * space complexity of reverse is O(1)
     *
     * @return reverse list
     */
    private ListNode reverse() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * this method is used for getting element element of linklist
     *
     * @return slowptr node
     * Note:
     * time complexity of getMiddleElement is O(n)
     * space complexity of getMiddleElement is O(1)
     */
    private ListNode getMiddleNode() {
        if (head == null) {
            return head;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    /**
     * this method is used to search nth element from last
     *
     * @param nthElement ,for nth element search from last
     * @return nth node from last
     * Note:
     * time complexity of getMiddleElement is O(n)
     * space complexity of getMiddleElement is O(1)
     */
    private ListNode getNthElementFromLast(int nthElement) {
        if (head == null) {
            return head;
        }
        if (nthElement <= 0) {
            throw new IllegalArgumentException("Invalid value :" + nthElement);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < nthElement) {
            if (refPtr == null) {
                throw new IllegalArgumentException(nthElement + " is greater then the number of node in list");
            }
            refPtr = refPtr.next;
            count++;

        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    /**
     * this method is used for to delete entire list node
     *
     * @return true
     */
    private boolean removeList() {
        if (head != null) {
            head = null;
            return true;
        }
        return true;
    }

    /**
     * this method is used for remove duplicates element from sorted list
     */
    private void removeDuplicatsFromSortedList() {
        ListNode current = head;
        int count = 0;
        if (head == null) {
            return;
        }
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                count++;
                current.next = current.next.next;
                System.out.println("Found duplicate element " + current.data);
            } else {
                current = current.next;
            }
        }
        if (count > 0) {
            System.out.println("Total duplicate element is removed " + count);
        } else {
            System.out.println("No duplicate element found ..");
        }
    }

    /**
     * this method is used to insert element in sorted list
     *
     * @param value insert element
     * @return newlist
     */
    private ListNode insertElementInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return head;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    /**
     * this method is used to remove element in sorted list
     *
     * @param key element want to remove
     */
    private void removeElementInSortedList(int key) {

        ListNode current = head;
        ListNode temp = null;
        int count = 0;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        //if element is found then we assigned current.next node to temp.next node
        temp.next = current.next;
        count++;
        getResultCount(count);
    }

    private void getResultCount(int count) {
        if (count > 0) {
            System.out.println("Found element " + count + " in times");
        } else {
            System.out.println("No element found..!!");
        }
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
        singleyListProblem.insertAtLast(90);
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

        ListNode reverseList = singleyListProblem.reverse();
        singleyListProblem.head = reverseList;
        System.out.println("==============reverse list===========");
        singleyListProblem.display();

        System.out.println("Middle element: " + singleyListProblem.getMiddleNode().data);

        System.out.println("nth element from last is " + singleyListProblem.getNthElementFromLast(2).data);

        singleyListProblem.insertAtFirst(60);
        singleyListProblem.insertAtFirst(80);
        singleyListProblem.display();
        System.out.println(singleyListProblem.removeList());
        singleyListProblem.display();

        // for making a sorted list
        singleyListProblem.insertAtFirst(40);
        singleyListProblem.insertAtFirst(30);
        singleyListProblem.insertAtFirst(30);
        singleyListProblem.insertAtFirst(20);
        singleyListProblem.insertAtFirst(20);
        singleyListProblem.insertAtFirst(10);
        singleyListProblem.display();

        singleyListProblem.removeDuplicatsFromSortedList();
        System.out.println("sorted list with no dulicates element \n");
        singleyListProblem.display();

        System.out.println("inserted element in sorted list ");
        singleyListProblem.insertElementInSortedList(35);
        singleyListProblem.display();

        singleyListProblem.removeElementInSortedList(30);
        singleyListProblem.display();
    }
}
