//Assignment Coding Problem
//        Problem Name: Print Reverse LinkedList
//        Problem Level: MEDIUM
//        Problem Description:
//        #### You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
//
//        #### To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
//
//        ##### Note :
//        You can’t change any of the pointers in the linked list, just print it in the reverse order.
//
//        ##### Input format :
//        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//        The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
//
//        ##### Remember/Constraints :
//        While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//
//        ##### Output format :
//        For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.
//
//        Output for every test case will be printed in a seperate line.
//
//        ##### Constraints :
//        1 <= t <= 10^2
//        0 <= M <= 10^3
//        Time Limit: 1sec
//
//        Where 'M' is the size of the singly linked list.
//        ##### Sample Input 1 :
//        1
//        1 2 3 4 5 -1
//
//        ##### Sample Output 1 :
//        5 4 3 2 1
//
//        ##### Sample Input 2 :
//        2
//        1 2 3 -1
//        10 20 30 40 50 -1
//
//        ##### Sample Output 2 :
//        3 2 1
//        50 40 30 20 10


import javax.swing.*;
import java.util.Scanner;

public class reversed_ll {
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

//    public static void printReverse(Node<Integer> root) {
//        //Your code goes here
//        Node<Integer> smallOutput=reversell(root);
//    }
//
//
//    public static Node<Integer> reversell(Node<Integer> head){
//        if (head==null)
//            return head;
//        Node<Integer> smallOutput=reversell(head.next);
//        System.out.print(head.data+" ");
//        return smallOutput;
//    }
//


    public static Node<Integer> printReverseRecursively(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }

        Node<Integer> finalhead = printReverseRecursively(head.next);
        Node<Integer> temp = finalhead;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next=null;
        return finalhead;

    }

    public static DoubleNode BetterreverseLL(Node<Integer> head){
        if (head == null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode finalans = BetterreverseLL(head.next);
        finalans.tail.next = head;
        head.next= null;
        DoubleNode ans = new DoubleNode();
        ans.head = finalans.head;
        ans.tail = head;
        return ans;

    }

    public static Node<Integer> reverseIteratively(Node<Integer> head){

        Node<Integer> curr = head ;
        Node<Integer> prev = null;
        Node<Integer> temp;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

    }


    public static void main (String args[]){
//        Node<Integer> root = takeinput();
//        printReverse(root);
//        print(root);


//        Node<Integer> head = takeinput();
//        head = printReverseRecursively(head);
//        print(head);

//
//        Node<Integer> head = takeinput();
//        DoubleNode ans = BetterreverseLL(head);
//        print(ans.head);


        Node<Integer> head =  takeinput();
        head = reverseIteratively(head);
        print(head);


    }
}
