//*

/*
coding Problem
        Problem Name: Count Words
        Problem Level: EASY
        Problem Description: #### Given a string S, count number of words in the string.
        ##### Note : Assume there is single space between two words and there are no extra spaces before and after words.
<br>

##### Input Format :
        String S
        ##### Output Format :
        Count of words
        ##### Constraints :
        0 <= |S| <= 10^7
        where |S| represents the length of string, S.


        ##### Sample Input 1:
        this is a sample string

        ##### Sample Output 1:


        ##### Sample Input 2:
        coding is awesome

        ##### Sample Output 2:


*/

public class Count_words {

    public static int print(String s) {
        int count = 0;

        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public static int string(String s) {
        int count1 = 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count1++;
            }

        }
        return count1;
    }


    public static void main (String [] args){
        String s = "this is a sample string";

        System.out.println(print(s));
        System.out.println(string(s));
    }
}
