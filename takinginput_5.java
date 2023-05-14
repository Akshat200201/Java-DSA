

import java.util.Scanner;
public class takinginput_5 {
    public static void main(String[] args) {
        System.out.println("taking input fromm the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1 ");
        int a = sc.nextInt();
        System.out.println("enter number 2 ");
        int b = sc.nextInt();
        System.out.print("sum of these number is: ");
        int sum=a+b;
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str=sc.next();
        System.out.println(str);

        String str1=sc.nextLine();
        System.out.println(str1);



    }
}
