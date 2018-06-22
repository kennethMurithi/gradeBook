//package alliancehighschool;
///**
// ** @author KENNE
// */
//public class InitArray {
//    // create and output two-dimensional arrays
//
//    public static void main( String[] arg){
//        int[][] age = {{1,2,3},{4,5,6,}};
//        int[][] hight ={{1,2},{3}, {4,5,6}};
//    
//        System.out.println("Value in array1 by row rate");
//        outputArray( age ); // diplays array2 by row
//        
//        System.out.println("\nValues in array2 by row are");
//        outputArray( hight ); // display array2 by row
//        
//        System.out.println("\n Value in array2 with totals");
//        totals(age);
//        
//} // end main
//    //output rows and columns of a two-dimension array
//    public static void outputArray ( int[][] array)
//    {
//        // loop through arrays rows
//        for ( int row = 0; row < array.length; row++)
//        {
//            //loop through columns of current row
//            for (int column =0 ; column< array[row].length; column++)
//            {
//                System.out.printf("%d", array[ row ][ column ]); 
//            }
//            System.out.println(); // start new line of output
//        }// end outer for loop
//    }// end outputArray method
//    
//    // totals 
//    public static void totals(int[][] array)
//    {
//        int total = 0;
//        
//        //loop through arrays rows
//        for (int row = 0; row < array.length; row++ )
//        {
//            for (int column = 0 ; column < array[row].length; column++ )
//            {
//                total +=array[row][column];
//            }
//        }
//    }
//}// end class initArray