package linklistproblem;

public class SingleyListProblem {

    private ListNode head;
    private static class ListNode{
        private int data; //generics type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        ListNode current = head;
        while(current != null){
            System.out.println(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int count()
    {
        if(head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String args[])
    {
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
        System.out.println("length of singly linklist "+singleyListProblem.count());
    }
}
