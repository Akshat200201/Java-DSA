import java.util.Scanner;

public class delete_node_from_ll {
    public static Node<Integer> takeinput(){
        Node<Integer> head = null , tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
//                Node<Integer> temp = head;
//                while (temp.next != null){
//                    temp = temp.next;
//                }
//                temp.next = newNode;
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;

    }
    public static void print(Node<Integer> head){
        while (head!= null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static Node<Integer> deleteNode(Node<Integer> head , int pos){
        if (pos == 0){
            return head.next;
        }
        if (head == null){
            return head;
        }

        head.next = deleteNode(head.next, pos-1);
        return head;
    }

    public static void main (String[] args){
        Node<Integer> head = takeinput();
        head = deleteNode(head , 3);
        print(head);
    }
}
