public class array_26 {
    public static void main(String[] args) {

        //problem1

//        float [] array= {1.08f ,2.686f ,4.454f ,78,34};
//        float sum= 0;
//        sum= sum+ array[0]+ array[1]+ array[2]+ array[3]+ array[4];
//        System.out.println(sum);

        //problem2


        /*
        float [] array= {1.08f ,2.686f ,4.454f ,78,34};
        float num= 2.696f;
        boolean isInArray= false;
        for (float element:array){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is in array");
        }
        else {
            System.out.println("the value is not present in array");
        }

         */

        //problem3

//        int [] physics={87,68,97,86,89};
//        int sum = 0;
//        for (int element:physics){
//            sum = sum+ element;
//
//        }
//        int average= sum/physics.length;
//        System.out.println(average);


        //problem4
//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//        int [][] mat2 = {{7,8,9},
//                         {10,11,12}};
//
//
//        int [][]  result = {{0,0,0},
//                             {0,0,0}};
//
//
//        for (int i=0;i<mat1.length;i++){ //row number of times
//            for (int j=0;j<mat1[i].length;j++){  // column number of times
//                System.out.format("setting value for i=%d and j=%d\n", i,j);
//                    result[i][j] = mat1[i][j] +  mat2[i][j];
//             }
//        }
//            //printing element of array;
//        for (int i=0;i<mat1.length;i++){ //row number of times
//            for (int j=0;j<mat1[i].length;j++){  // column number of times
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] +  mat2[i][j];
//            }
//            System.out.println(" ");
//        }

        //problem5
//        int [] arr={1,2,3,4,5,6};
//        int l= arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for (int i=0; i<n;i++){
//            //swap a[i] and a[l-i-1]
//            temp = arr[i];
//            arr[i]= arr[l-1-i];
//            arr[l-i-1] = temp;
//
//        }
//        for(int element:arr){
//            System.out.println(element + " " );
//        }

//            problem 6
            int [] arr={1,21,3,-544,5,34,67};
            int max=Integer.MIN_VALUE;
            for (int e: arr){
                if (e>max){
                    max =e;

                }
            }
        System.out.println("the value of maximum element in this array is " + max);
//        System.out.println(Integer.MIN_VALUE);



    }
}
