//Assignment Coding Problem
//        Problem Name: Replace pi (recursive)
//        Problem Level: MEDIUM
//        Problem Description: ####Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
//        #####Sample Input 1 :
//        xpix
//
//        #####Sample Output :
//        x3.14x
//
//        #####Sample Input 2 :
//        pipi
//
//        #####Sample Output :
//        3.143.14
//
//        #####Sample Input 3 :
//        pip
//
//        #####Sample Output :
//        3.14p



public class replace_pi_recursive {
    public static String replace_pi(String s){
       if ( s.length() <= 1) return s;

        if (!(s.charAt(0) != 'p' && s.charAt(1) != 'i')) {

            // Smalloutput is a variable
            // used to store recursion result
            String smallOutput = replace_pi(s.substring(2));

            // And we have to add the recursion
            // result with the first part we
            // handled and return the answer
            return "3.14" + smallOutput;
        }
        else {

            // If not then we have to call
            // recursion from 1st to all elements
            // then add recursion result to
            // 1st element and return it
            String smallOutput = replace_pi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }


    }
    public static void main (String args []){

        String s = "pipppiiipi";
        String s1 = "hpiuglfuflfguhvohgfo";
        // Function call
        String result = replace_pi(s1);
        System.out.println(result);
    }
}
