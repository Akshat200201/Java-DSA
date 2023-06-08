package dsa;

public class fibonacci {
    static int fibonacciSeriesOfN(int n){
         if (n<=2) return n ;

        return fibonacciSeriesOfN(n-1)+ fibonacciSeriesOfN(n-2);

    }





    public static void main (String [] args){

        System.out.println(fibonacciSeriesOfN(4));


    }
    }

