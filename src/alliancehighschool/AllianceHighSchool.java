package alliancehighschool;

public class AllianceHighSchool {

    public static void main (String[] args) {
        
        // student input array(more tipically input at runtime)
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        
        //array of frequency counter
        int[] frequency = new int[6];
        
        //for each answer, select responses element and use that value 
        //as frequency index to detemine element to increment
        for (int answer = 0; answer < responses.length; answer++){
            try{
                ++frequency[responses[answer]];
            }//end try
            catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println(e);
                        System.out.printf("responses[%d] = %d\n\n", answer, responses[answer] );
            }//end catch
        } //end for
        
        System.out.printf("%s10s\n", "Rating", "Frequency");
        //output each array elements value;
        for (int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
                        
       }  // end main
} //end class InitArray
