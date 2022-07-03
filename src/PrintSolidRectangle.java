public class PrintSolidRectangle {


    public static void printSolidRectangle(int [] arr){

        for( int i=0; i< arr.length-1; i++ ){
            for(int j=0; j<arr.length; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }


    }



    public static void main(String[] args) {

        int [] arr = new int[4];
        printSolidRectangle(arr);

    }
}
