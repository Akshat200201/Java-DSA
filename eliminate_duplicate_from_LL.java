//Assignment Coding Problem
//        Problem Name: Eliminate duplicates from LL
//        Problem Level: MEDIUM
//        Problem Description:
//        #### You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
//
//        ##### Input format :
//        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//        The first and the only line of each test case or query contains the elements(in ascending order) of the singly linked list separated by a single space.
//
//        ##### Remember/Consider :
//        While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//
//        ##### Output format :
//        For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.
//
//        Output for every test case will be printed in a seperate line.
//
//        ##### Constraints :
//        1 <= t <= 10^2
//        0 <= M <= 10^5
//        Time Limit: 1sec
//
//        Where 'M' is the size of the singly linked list.
//        ##### Sample Input 1 :
//        1
//        1 2 3 3 4 3 4 5 4 5 5 7 -1
//
//        ##### Sample Output 1 :
//        1 2 3 4 3 4 5 4 5 7
//
//        ##### Sample Input 2 :
//        2
//        10 20 30 40 50 -1
//        10 10 10 10 -1
//
//
//        ##### Sample Output 2 :
//        10 20 30 40 50
//        10


import java.util.Scanner;

public class eliminate_duplicate_from_LL {
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



    public static Node<Integer> new_list(Node<Integer> head){

        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> uniqueNode=head.next;
        Node<Integer> node=head;

        while (uniqueNode!=null)
        {
            //System.out.println("Current uniqueNode data: " + uniqueNode.data);
            //System.out.println("Current node data: "+ node.data);
            if (!(uniqueNode.data).equals(node.data))
            {
                //System.out.println("Adding uniqueNode to the updated linkedlist");
                node.next=uniqueNode;
                node=node.next;
                //Runner.print(head);
            }
            uniqueNode=uniqueNode.next;
            //System.out.println();
        }
        node.next=uniqueNode;

            /*LinkedListNode<Integer> node=head;
        	while(node.next!=null)
        	{
            	if(node.data==node.next.data)
            	{
                	node.next=node.next.next;
            	}
            	else
                {
            		node=node.next;
            	}
        	}*/

        return head;
    }
    public static void main (String args[]){

        Node<Integer> head = takeinput();
        new_list(head);
        print(head);

    }
}
