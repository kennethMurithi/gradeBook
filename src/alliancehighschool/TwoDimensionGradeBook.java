//package alliancehighschool;
///**
// * @author KENNE
// */
//public class TwoDimensionGradeBook {
//    private String Coursename; // name of course this grade book represents
//    private int[][] grades; // two dimensional array of student grades
//    
//    //two argument constructor initialize courseName and grades arrays
//    public TwoDimensionGradeBook(String name, int[][] gradesArray) 
//    {
//        Coursename = name; //initialize courseName
//        grades = gradesArray; //store grades
//    } // end two argument Gradebook constructor
//    
//    // method to set the course name
//    public void setCoursename(String name)
//    {
//        Coursename = name; // store the coursename 
//    }// end method setCourseName
//    
//    // method to retrieve the course name
//    public String getCoursename() 
//    {
//        return Coursename;//end method getCoursename
//    }
//
//    // display a Welcome message to the Grade Book user
//    public void displayMessage()
//    {
//        // getCorsename gets the name of the course
//        System.out.printf("Welcome to Grade Book for \n%s!\n\n",
//                getCoursename() );
//    }// end Method displayMessage 
//    
//    // perform various operations on the data
//    public void processGrade()
//    {
//        // output grades array
//        //outputGrade();
//        
//        //call methods GetMinimum and getMaximum
//        System.out.printf("\n%s %d\n%s %d\n\n,",
//               "Lowest Grade in the gradebook is", getMinimum(),
//               "Highest Grade in the Grade Book is ", getMaximum()  );
//        
//        // output Grade Distribution chart of all Grades on all tests
//        outputBarChart();
//    }// end method ProcessGradees
//    
//    // Find minimum grades
//    private int getMinimum() 
//    {
//        // assume  first element of grades is smallest
//        int lowGrade = grades[0][0];
//        
//        // loop through rows of grade array
//        for (int[] studentGrades : grades)
//        {
//            // loop through columns of curent row
//            for( int grade : studentGrades)
//            {
//                // if Grade less than lowGrade, assign it to lowgrade
//                if(grade < lowGrade)
//                    lowGrade =grade;
//            }// end iner for
//        }// end outer for
//        
//        return lowGrade; //return lowest Grade  
//    }// end method GetMinimum
//    
//    // find maximum grade
//    public int getMaximum ()
//    {
//        // assume first element of grades is the largest
//        int highGrade = grades[0][0];
//        
//        // loop through rows of grades array
//        for (int[] studentGrades : grades )
//        {
//            //loop through columns of current row
//            for (int grade : studentGrades)
//            {
//                // if grade greater than highGrade, assigh it to highGrade
//                if (grade > highGrade)
//                    highGrade = grade;
//            }// end the inner for
//        }// end outer for
//        
//        return highGrade; //return highest Grade
//    }//end method getMaximum
//    
//    // determine average grade for particular set of grades
//    private double getAverage( int[] setOfGrades)
//    {
//        int total = 0; // initialize total
//        
//        // sum grades for one Student
//        for ( int grade : setOfGrades )
//            total += grade;
//        
//        // return average of grades
//        return (double) total/setOfGrades.length;
//    }// end method getAverage
//    
//    // output bar chart displaying overall grade distribution
//    public void outputBarChart()
//    {
//        System.out.println( "Overall grade distribution:" );
//        
//        // store frequency of grades in each range of 10 grades
//        int[] frequency = new int[11];
//        
//        // for each grade in gradebook, increment the appropriate frequency
//        for (int[] studentGrades : grades )
//        {
//            for (int grade : studentGrades)
//                ++frequency[ grade/10];
//        } // end outer for
//        
//        // for each grade frequency, print bar in chart
//        for ( int count = 0; count < frequency.length; count++)
//        {
//            // output bar label ("00-09: ", ..., "90 - 99:" ", "100: ")
//            if ( count == 10)
//                System.out.printf("%5d: ", 100);
//            else 
//                System.out.printf("%02d-%02d:",
//                        count * 10, count * 10 +9 );
//            
//            // print bar of astericks
//            for ( int stars = 0; stars < frequency[ count ]; stars++)
//                System.out.println("*");
//            
//            System.out.println(); // start a new line of output
//        }// end outer for
//    }// end method outputBarChart
//    
//    // output the contents of the grades array
//    public void outputGrades()
//    {
//        System.out.println("The grades are :\n");
//        System.out.print("                 ");// align column heads
//        
//        // create a olumn heading for each of the tests
//        for ( int test = 0; test < grades[0].length; test++)
//            System.out.printf("Test %d   ", test + 1);
//        
//        System.out.println("Average"); // student average column heading 
//        
//        // create rows/columns of test representing array grades
//        for ( int student = 0; student < grades.length; student++)
//        {
//            System.out.printf( "Student  %2d ", student + 1 );
//            
//            for (int test : grades[ student ])// output students grade s
//                System.out.printf( "%8d", test);
//            
//            // call method getAverage to calculate student's average grade;
//            //  pass row of grades as argument to getAverage
//            double average = getAverage( grades[ student ]);
//            System.out.printf("%9.2f\n", average);
//        }// end outer for 
//    } // end method outputGrades
//} // end class Grade book
