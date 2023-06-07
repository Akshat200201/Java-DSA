//
//Assignment Coding Problem
//        Problem Name: Remove X
//        Problem Level: MEDIUM
//        Problem Description: #### Given a string, compute recursively a new string where all 'x' chars have been removed.
//
//        ##### Input format :
//        String S
//
//        ##### Output format :
//        Modified String
//
//        ##### Constraints :
//        1 <= |S| <= 10^3
//        where |S| represents the length of string S.
//        ##### Sample Input 1 :
//        xaxb
//
//        ##### Sample Output 1:
//        ab
//
//        ##### Sample Input 2 :
//        abc
//
//        ##### Sample Output 2:
//        abc
//
//        ##### Sample Input 3 :
//        xx
//
//        ##### Sample Output 3:




public class remove_x {

    public static String removex(String s){
        if (s.length()<1) return s;

        if (s.charAt(0) == 'x')
            return removex(s.substring(1,s.length()));

        return s.charAt(0)+ removex(s.substring(1,s.length()));
    }

    public static void main (String args[]){

        String s= "sawfwibbixbaibceibxxcidx";
        String result = removex(s);
        System.out.println(result);

    }
}
