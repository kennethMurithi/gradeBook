package alliancehighschool;


public class AllianceHighSchool {

    public static void main(String[] args) {
        
      int [] array; //declare array named array
      
      array = new int[10];// create the array object
      
      System.out.printf("%s%8s\n", "index", "value");// column headings
      
      //output each array elements value
      
      for (int counter = 0; counter < array.length; counter++ ){
          System.out.printf("%5d%8d\n", counter, array[ counter ]);
      }
      
    }  // end main
} //end class InitArray
