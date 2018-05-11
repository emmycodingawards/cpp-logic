class LL{

	private ListNode head;
	private ListNode tail;
	private int length_of_LL;

	private class ListNode{
		private int data;
		private String str;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data, String str){
			this.data = data;
			this.str = str;
		}
	}

	public LL(){
		this.head = null;
		this.tail = null;
		this.length_of_LL = 0;
	}

	public boolean isEmpty(){return length_of_LL == 0;}

	//public void die(){return 0;}

	public int length_of_LL(){
		return length_of_LL;
	}

	public void display_forward(){
		if(head == null){return;}
		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.data + ", " + temp.str + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void print_n(int n) {
		//Do a system.out.println for element N here
		ListNode temp = head;
		for (int i = 0; i < n; i++) {
			temp = temp.next;
			System.out.println(temp.str);
		}
	}

	public void display_backward(){
		if(tail == null){return;}
		ListNode temp = tail;
		while(temp != null){
			System.out.print(temp.data + ", " + temp.str + " -> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public void insert_first(int value, String str){ //insert to the front of the LL
		ListNode newNode = new ListNode(value, str);
		if(isEmpty()){tail = newNode;}
		else{head.previous = newNode;}
		newNode.next = head;
		head = newNode;
		length_of_LL++;
	}

	public void insert_last(int value, String str){ //insert at the end of the LL
		ListNode newNode = new ListNode(value, str);
		if(isEmpty()){head = newNode;}
		else{
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length_of_LL++;
	}

	public ListNode delete_first(){
		//if(isEmpty()){die();} //need to look up java exception handling
		ListNode temp = head;
		if(head == tail){tail = null;}
		else{head.next.previous = null;}
		head = head.next;
		temp.next = null;
		length_of_LL--;
		return temp;
	}

	public ListNode delete_last(){
		//if(isEmpty()){die();} // and again
		ListNode temp = tail;
		if(head == tail){head = null;}
		else{tail.previous.next = null;}
		tail = tail.previous;
		temp.previous = null;
		length_of_LL--;
		return temp;
	}

	public static void main(String[] args){
		LL cpp_ll = new LL();

		//change these values to populate the list
		cpp_ll.insert_first(3, "question three");
		cpp_ll.insert_first(2, "question two");
		cpp_ll.insert_first(1, "question one");


		//test post, do not upvote
		cpp_ll.display_forward();
		cpp_ll.display_backward();
		cpp_ll.delete_first();
		cpp_ll.display_forward();
		cpp_ll.delete_last();
		cpp_ll.display_forward();

	}
}
