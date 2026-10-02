public class LinkedListDemo {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class MyLinkedList{
        Node head;

        void insert(int data){
            Node newNode = new Node(data);

            if (head == null){
                head = newNode;
                return;
            }   

            Node current =head;

            while(current.next !=null){
                current =current.next;
            }
            current.next =newNode;
        }
        
        void insertAtBeginning(int data){
            Node newNode =new Node(data);
            newNode.next =head;
            head = newNode;
        }

        void delete(int data){
            if(head == null){
                return;
            }
            if(head.data == data){
                head =head.next;
                return;
            }

            Node current =head;

            while(current.next!=null && current.next.data !=data){
                current =current.next;
            }
            if(current.next != null){
                current.next =current.next.next;
            }
        }

        boolean search(int data){
            Node current = head;

            while(current !=null){
                if(current.data == data){
                    return true;
                }
                current =current.next;
            }
            return false;
        }

        void display(){
            Node current = head;

            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.insertAtBeginning(5);

        list.display();
        System.out.println("Search 30: " + list.search(30));
        list.delete(30);
        System.out.println("After deletion:");
        list.display();
        System.out.println("Search 30 after deletion: " + list.search(30));

    }
}