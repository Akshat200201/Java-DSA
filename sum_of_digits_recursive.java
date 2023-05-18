//Assignment Coding Problem
//        Problem Name: Sum of digits (recursive)
//        Problem Level: MEDIUM
//        Problem Description: #### Write a recursive function that returns the sum of the digits of a given integer.
//
//        ##### Input format :
//        Integer N
//        ##### Output format :
//        Sum of digits of N
//        ##### Constraints :
//        0 <= N <= 10^9
//        ##### Sample Input 1 :
//        12345
//
//        ##### Sample Output 1 :
//        15
//
//        ##### Sample Input 2 :
//        9
//
//        ##### Sample Output 2 :
//        9


public class sum_of_digits_recursive {
    public static int sum_is(int n ){
        if (n == 0)
            return 0;

        return (n % 10 + sum_is(n / 10));



    }
    
    
    public static void main (String [] args){
        System.out.println(sum_is(12345));
    }
}
