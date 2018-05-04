//WIP - Chris M

class LL{

        private ListNode head;
        private ListNode tail;
        private int length_of_LL;

        private class ListNode{
                private int data;
                private ListNode next;
                private ListNode previous;

                public ListNode(int data){
                        this.data = data;
                }
        }

        public LL(){
                this.head = null;
                this.tail = null;
                this.length_of_LL = 0;
        }

        public boolean isEmpty(){ //returns true if list is empty
                return length_of_LL == 0;
        }

        public int length_of_LL(){
                return length_of_LL;
        }

        public void display_forward(){
                if(head == null){return;}
                ListNode temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public void display_backward(){
                if(tail == null){return;}
                ListNode temp == tail;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.previous;
                }
                System.out.println("null");
        }
                
        public void insert_first(int value){ //insert to the front of the LL
                ListNode newNode = new ListNode(value);
                if(isEmpty()){tail = newNode;}
                else{head.previous = newNode;}
                newNode.next = head;
                head = newNode;
                length_of_LL++;
        }

        public insert_last(int value){ //insert at the end of the LL
                ListNode newNode = new ListNode(value);
                if(isEmpty()){head = newNode;}
                else{
                        tail.next = newNode;
                        newNode.previous = tail;
                }
                tail = newNode;
                length++;
        }

        public ListNode delete_first(){
                if(isEmpty()){throw new does_not_exist();} //need to look up java exception handling
                ListNode temp = head;
                if(head == tail){tail = null;}
                else{head.next.previous = null;}
                head = head.next;
                temp.next = null;
                length--;
                return temp;
        }

        public ListNode delete_last(){
                if(isEmpty()){throw new does_not_exist();} // and again
                ListNode temp = tail;
                if(head == tail){head = null;}
                else{tail.previous.next = null;}
                tail = tail.previous;
                temp.previous = null;
                length--;
                return temp;
        }

        public static void main(String[] args){
                LL cpp_ll = new LL();
                
                //change these values to populate the list
                cpp_ll.insert_first(1);
                cpp_ll.insert_first(2);
                cpp_ll.insert_first(3);
                
                
                //test post, do not upvote
                //cpp_ll.display_forward();
                //cpp_ll.display_backward();
                //cpp_ll.delete_first();
                //cpp_ll.display_forward();
                //cpp_ll.delete_last();
                //cpp_ll.display_forward();
                
        }
