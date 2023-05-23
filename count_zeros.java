//Assignment Coding Problem
//        Problem Name: Count Zeros
//        Problem Level: MEDIUM
//        Problem Description: #### Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
//
//        ##### Input Format :
//        Integer N
//
//        ##### Output Format :
//        Number of zeros in N
//
//        ##### Constraints :
//        0 <= N <= 10^9
//        ##### Sample Input 1 :
//        10204
//
//        ##### Sample Output 1 :
//        2
//
//        ##### Sample Input 2 :
//        708000
//
//        ##### Sample Output 2 :
//        4



public class count_zeros {

    public static int  zeros( int n){
        if (n%10 == 0){
            return 1 + zeros(n/10);
        }

        else if (n/10 == 0) {
            return 0;
        }

        else {
            return zeros(n/10);
        }
    }


    public static void main (String [] args){
        System.out.println(zeros(12869));
    }
}
