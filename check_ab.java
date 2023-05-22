/*
Assignment Coding
 Problem Name: Check AB
        Problem Level: MEDIUM
        Problem Description: #### Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
        a. The string begins with an 'a'
//        b. Each 'a' is followed by nothing or an 'a' or "bb"
//        c. Each "bb" is followed by nothing or an 'a'

        #### If all the rules are followed by the given string, return true otherwise return false.

        ##### Input format :
        String S

        ##### Output format :
        'true' or 'false'

        ##### Constraints :
        0 <= |S| <= 1000
        where |S| represents length of string S.
        ##### Sample Input 1 :
        abb

        ##### Sample Output 1 :
        true

        ##### Sample Input 2 :
        abababa

        ##### Sample Output 2 :
        false
rules
            a. The string begins with an 'a'
////        b. Each 'a' is followed by nothing or an 'a' or "bb"
////        c. Each "bb" is followed by nothing or an 'a'
*/


public class check_ab {
    public static boolean checkIf(String s) {
        // Write your code here
        boolean smallAnswer = false;
        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            if (s.charAt(0) == 'a') {
                smallAnswer = true;
                s = s.substring(1);
            }
        } else if (s.length() == 2) {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
                smallAnswer = true;
                s = s.substring(2);
            }
        } else if (s.length() >= 3) {
            if (s.charAt(0) == 'a' && s.substring(1, 3).equals("bb")) {
                smallAnswer = true;
                s = s.substring(3);
            } else if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
                smallAnswer = true;
                s = s.substring(1);
            }
        }
        return smallAnswer && checkIf(s);

    }

    public static void mian (String args[]){

        System.out.println(checkIf("aaavbasjbk"));
    }
}
