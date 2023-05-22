//
//Coding Problem
//        Problem Name: Check number recursively
//        Problem Level: EASY
//        Problem Description: ####Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
//        ####Do this recursively.
//
//        #####Input Format :
//        Line 1 : An Integer N i.e. size of array
//        Line 2 : N integers which are elements of the array, separated by spaces
//        Line 3 : Integer x
//
//        #####Output Format :
//        'true' or 'false'
//
//        #####Constraints :
//        1 <= N <= 10^3
//
//        #####Sample Input 1 :
//        3
//        9 8 10
//        8
//
//        ##### Sample Output 1 :
//        true
//
//        ##### Sample Input 2 :
//        3
//        9 8 10
//        2
//
//        ##### Sample Output 2 :
//        false



public class check_number_recursively {
    public static boolean print(int arr[]){
        int n= 54;
        if(arr[0]==n) return true;

        int arr1[]=new int[arr.length-1];

        for(int i=1;i<arr.length;i++) {
            arr1[i - 1] = arr[i];
            if (arr1[0]== n) return true;
        }

        return false;


    }

    public static void main (String []args){
        int arr[]= {9,8,10};
        System.out.println(print(arr));
    }
}
