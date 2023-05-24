//Coding Problem
//        Problem Name: Delete a Node from Linked List
//        Problem Level: MEDIUM
//        Problem Description:
//        #### You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'pos'.
//
//        ##### Note :
//        Assume that the Indexing for the linked list always starts from 0.
//
//        If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
//
//        ##### Illustration :
//        The following images depict how the deletion has been performed.
//
//        #### Image-I :
//        ![Alt txt](https://files.codingninjas.in/0000000000004029.png)
//
//        #### Image-II :
//        ![Alt txt](https://files.codingninjas.in/0000000000004033.png)
//
//        ##### Input format :
//        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//        The first line of each test case or query contains the elements of the linked list separated by a single space.
//
//        The second line contains the integer value of 'pos'. It denotes the position in the linked list from where the node has to be deleted.
//
//        ##### Remember/Consider :
//        While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//
//        ##### Output format :
//        For each test case/query, print the resulting linked list of integers in a row, separated by a single space.
//
//        Output for every test case will be printed in a seperate line.
//
//        ##### Constraints :
//        1 <= t <= 10^2
//        0 <= N <= 10^5
//        pos >= 0
//        Time Limit: 1sec
//
//        Where 'N' is the size of the singly linked list.
//
//        ##### Sample Input 1 :
//        1
//        3 4 5 2 6 1 9 -1
//        3
//
//        ##### Sample Output 1 :
//        3 4 5 6 1 9
//
//        ##### Sample Input 2 :
//        2
//        3 4 5 2 6 1 9 -1
//        0
//        10 20 30 40 50 60 -1
//        7
//
//        ##### Sample Output 2 :
//        4 5 2 6 1 9
//        10 20 30 40 50 60


import java.util.Scanner;

public class delete_a_node_from_linked_list {
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

    public static void delete_node(Node<Integer> head, int pos){


       if (pos == 0){
           head = head.next;
           return;
       }
       Node temp = head;
       for (int i=0;i<pos-1;i++){
           temp = temp.next;
       }
       temp.next = temp.next.next;

    }
    public static void main (String args []){

    Node<Integer> head=takeinput();
    delete_node(head ,4);
    print(head);

    }
}
