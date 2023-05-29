//
//Coding Problem
//        Problem Name: First Index
//        Problem Level: EASY
//        Problem Description: ####Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
//        ####First index means, the index of first occurrence of x in the input array.
//        ####Do this recursively. Indexing in the array starts from 0.
//
//        #####Input Format :
//        Line 1 : An Integer N i.e. size of array
//        Line 2 : N integers which are elements of the array, separated by spaces
//        Line 3 : Integer x
//
//        #####Output Format :
//        first index or -1
//
//        #####Constraints :
//        ####1 <= N <= 10^3
//
//        #####Sample Input :
//        4
//        9 8 10 8
//        8
//
//        #####Sample Output :
//        1


public class first_index {

    public static int print(int arr[]){
        int x= 18;
        if (arr[0]==x) return 0;

        int arr1[]= new int[arr.length-1];

        for(int i=1;i<arr.length;i++) {
            arr1[i - 1] = arr[i];
            if (arr[i]==x) return i;
        }

        return -1;
    }

    public static void main (String []args){
        int arr[]= {9,18,10,8};
        System.out.print(print(arr));

    }
}
