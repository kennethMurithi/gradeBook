package alliancehighschool;
/**
 * @author KENNE
 */
public class TwoDimensionGradeBook {
    private String Coursename; // name of course this grade book represents
    private int[][] grades; // two dimensional array of student grades
    
    //two argument constructor initialize courseName and grades arrays
    public TwoDimensionGradeBook(String name, int[][] gradesArray) 
    {
        Coursename = name; //initialize courseName
        grades = gradesArray; //store grades
    } // end two argument Gradebook constructor
    
    // method to set the course name
    public void setCoursename(String name)
    {
        Coursename = name; // store the coursename 
    }// end method setCourseName
    
    // method to retrieve the course name
    public String getCoursename() 
    {
        return Coursename;//end method getCoursename
    }

    // display a Welcome message to the Grade Book user
    public void displayMessage()
    {
        // getCorsename gets the name of the course
        System.out.printf("Welcome to Grade Book for \n%s!\n\n",
                getCoursename() );
    }// end Method displayMessage 
    
    // perform various operations on the data
    public void processGrade()
    {
        // output grades array
        //outputGrade();
        
        //call methods GetMinimum and getMaximum
        System.out.printf("\n%s %d\n%s %d\n\n,",
               "Lowest Grade in the gradebook is", getMinimum(),
               "Highest Grade in the Grade Book is ", getMaximum()  );
        
        // output Grade Distribution chart of all Grades on all tests
        outputBarChart();
    }// end method ProcessGradees
    
    // Find minimum grades
    private int getMinimum() 
    {
        // assume  first element of grades is smalest
        int lowGrade = grades[0][0];
        
        // loop through rows of grade array
        for (int[] studentGrades : grades)
        {
            // loop through columns of curent row
            for( int grade : studentGrades)
            {
                // if Grade less than lowGrade, assign it to lowgrade
                if(grade < lowGrade)
                    lowGrade =grade;
            }// end iner for
        }// end outer for
        
        return lowGrade; //return lowest Grade  
    }// end method GetMinimum
    
    // find maximum grade
    public int getMaximum ()
    {
        // assume first element of grades is the largest
        int highGrade = grades[0][0];
        
        // loop through rows of grades array
        for (int[] studentGrades : grades )
        {
            //loop through columns of current row
            for (int grade : studentGrades)
            {
                // if grade greater than highGrade, assigh it to highGrade
                if (grade > highGrade)
                    highGrade = grade;
            }// end the inner for
        }// end outer for
        
        return highGrade; //return highest Grade
    }//end method getMaximum
    
    // determine average grade for particular set of grades
    private double getAverage( int[] setOfGrades)
    {
        int total = 0; // initialize total
        
        // sum grades for one Student
        for ( int grade : setOfGrades )
            total += grade;
        
        // return average of grades
        return (double) total/setOfGrades.length;
    }// end method getAverage
    
    // output bar chart displaying overall grade distribution
    public void outputBarChart()
    {
        System.out.println( "Overall grade distribution:" );
        
        // store frequency of grades in each range of 10 grades
        int[] frequency = new int[11];
        
        // for each grade in gradebook, increment the appropriate frequency
        for (int[] studentGrades : grades )
        {
            for (int grade : studentGrades)
                ++frequency[ grade/10];
        }
    }
    
}
