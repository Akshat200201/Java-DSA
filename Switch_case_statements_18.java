import java.util.Scanner;

public class Switch_case_statements_18 {
    public static void main(String[] args) {
         int age;
        System.out.print("enter your age:: ");
         Scanner sc= new Scanner(System.in);
         age= sc.nextInt();

         switch(age){
             case 18:
                 System.out.println("ur going to become adult!!");
                 break;
             case 23:
                 System.out.println("ur going to join a job");
                 break;
             case 32:
                 System.out.println("ur going to start a company");
                 break;
             case 60:
                 System.out.println("ur going to join a retire!!!");
                 break;
             default:
                 System.out.println("enjoy your life");
         }
        System.out.println("thanks for using my code");


//        int age;
//        System.out.print("enter your age:: ");
//        Scanner sc= new Scanner(System.in);
//        age= sc.nextInt();


//         if(age>56){
//             System.out.println("ur experienced");
//         }
//         else if(age>46){
//             System.out.println("you r semi experienced");
//         }
//         else if(age>36){
//             System.out.println("u r semi-semi-experienced");
//         }
//         else{
//             System.out.println("you r not experienced");
//         }
//         if(age>2){
//             age= sc.nextInt();
//             System.out.println("you are not baby");
//         }


    }
}
