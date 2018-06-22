package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
    		// Inserts a value in sorted order. If we insert 4, 2, 1, 5
    		// the list should look like HEAD->1->2->4->5->null
    	
        // add your code here
    	IntegerNode newNode = new IntegerNode(value);
    	IntegerNode current;
    	
    		current = head;
    		if (getSize() == 0 || current.getValue() >= value ) {
    			addToFront(value);
    		}
    		else {
    			while (current.getNext() !=null && current.getNext().getValue() < value) {
        			current = current.getNext();
        		}
    			newNode.setNext(current.getNext());
    			current.setNext(newNode);
    		}
    		size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
