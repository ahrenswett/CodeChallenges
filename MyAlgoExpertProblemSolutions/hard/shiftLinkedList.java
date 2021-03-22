import java.util.*;

class Program {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
		if(k==0) return head;
    int length = 1;
		LinkedList tail = head;
		while(tail.next != null){
			length++;
			tail = tail.next;
		}
		if((k%length)==0)return head;
		
		// set the new head
		tail.next = head;
		
		//find index of new tail
		int newTail = (length - (k%length))%length;
		
		System.out.println("k =" + k +"first " + (length - (k%length))%length);
		
		tail = head;
		
		//find new tail
		while(newTail > 1){
			newTail--;
			tail = tail.next;
		}
		System.out.println(tail.value);
		//set tail.next to head
		head = tail.next;
		System.out.println(head.value);
		
		tail.next = null;
		return head;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
	
}
