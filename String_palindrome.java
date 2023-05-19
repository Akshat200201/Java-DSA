



//Coding Problem
//        Problem Name: String Palindrome
//        Problem Level: EASY
//        Problem Description: #### Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
//        #### Palindrome strings are those, where string s and its reverse is exactly same.
//
//
//        ##### Input Format :
//        String S
//        ##### Output Format :
//        "true" if S is palindrome, else "false"
//        ##### Constraints :
//        0 <= |S| <= 10^7
//        where |S| represents the length of string, S.
//        ##### Sample Input 1 :
//        abcdcba
//        ##### Sample Output 1 :
//        true
//
//        ##### Sample Input 1 :
//        abcd
//        ##### Sample Output 1 :
//        false


public class String_palindrome {

    public static boolean string(String s){
        int i= 0;
        int j= s.length()-1;
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }


    public static void main(String []args){

     String s= "abcba";
        System.out.println(string(s));
    }
}
