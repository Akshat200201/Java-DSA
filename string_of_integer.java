//Assignment Coding Problem
//        Problem Name: String to Integer
//        Problem Level: MEDIUM
//        Problem Description: #### Write a recursive function to convert a given string into the number it represents.
//        That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
//
//        ##### Input format :
//        Numeric string S (string, Eg. "1234")
//
//        ##### Output format :
//        Corresponding integer N (int, Eg. 1234)
//
//        ##### Constraints :
//        0 <= |S| <= 9
//        where |S| represents length of string S.
//        ##### Sample Input 1 :
//        0000000001231
//
//        ##### Sample Output 1 :
//        1231
//
//        ##### Sample Input 2 :
//        12567
//
//        ##### Sample Output 2 :
//        12567



public class string_of_integer {
    public static int  stringToInteger(String s){
        if (s.length() == 1)
            return s.charAt(0) - 48;

        return stringToInteger(s.substring(0,s.length()-1))*10 + (s.charAt(s.length()-1)-48);

    }

    public static void main (String args []){
            String s = "1234";
        System.out.println(stringToInteger(s));
    }
}
