package dsa;

public class cowndown {
    static int CownDown(int n){
        if (n== 0)  return n;

            System.out.println(n);
             return CownDown(n-1);
    }
    public static void main (String[] args){
        System.out.println(CownDown(3));

    }
}
