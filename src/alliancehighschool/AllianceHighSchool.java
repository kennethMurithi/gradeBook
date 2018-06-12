package alliancehighschool;

public class AllianceHighSchool {

    // main method begins program execution
    public static void main (String[] args) {
         
        // array of student grades
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        GradeBook myGradeBook = new GradeBook("ARTIFICIAL INTELIGENCE", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        
       }  // end main
} //end class GradeBookTest
