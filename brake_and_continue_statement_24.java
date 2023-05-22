public class brake_and_continue_statement_24 {
    public static void main(String[] args) {
        //brake and continue using loops

//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("java is grate");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//
//            }
        int i=0;
        while(i<5) {
            System.out.println(i);
            System.out.println("java is grate");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            i++;
            System.out.println("loop ends here");
        }

        //for do while

//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("java is grate");
//            if (i == 2) {
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
        System.out.println("loop ends here");

    }
}
