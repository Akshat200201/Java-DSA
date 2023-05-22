//Assignment Coding Problem
//        Problem Name: Check Palindrome (recursive)
//        Problem Level: MEDIUM
//        Problem Description: #### Check whether a given String S is a palindrome using recursion. Return true or false.
//
//        ##### Input Format :
//        String S
//
//        ##### Output Format :
//        'true' or 'false'
//
//        ##### Constraints :
//        0 <= |S| <= 1000
//        where |S| represents length of string S.
//        #####Sample Input 1 :
//        racecar
//
//        #####Sample Output 1:
//        true
//
//        #####Sample Input 2 :
//        ninja
//
//        #####Sample Output 2:
//        false




public class check_palindrome_recursoin {
    static boolean isPalRec(String str,int start, int end)
    {
        // If there is only one character
        if (start == end)
            return true;

        // If first and last
        // characters do not match
        if ((str.charAt(start)) != (str.charAt(end)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (start < end + 1)
            return isPalRec(str, start + 1, end - 1);

        return true;
    }
    public static boolean isStringPalindrome(String input)
    {   int n = input.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(input, 0, n - 1);
    }


    public static void main (String [] args){

//        System.out.println(isStringPalindrome());
    }
}
