// time2 class declararion with overloaded  constructors
package enums;

/**
 *
 * @author KENNE
 */
public class Time2 {
    private int hour; //0-23 
    private int minute; //0- 59
    private int second; //0-59
    
    // set a new time value using universal time; throw an exemption 
    // if the hour, minute or second are invalid  
    public void setTime(int h, int m, int s){
        if (( h >= 0 && h<24) && (m >= 0 && m < 59) && ( s >= 0 && s < 59))
        {
            hour = h;
            minute = m;
            second = s;
        }// end if
        else
            throw new IllegalArgumentException(
                    "hour minute and/or second was out of range");
    }// end method SetTime 
    
    // convert to string in universal-time  format  (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour ,minute,second );
    } // end method touniversalString
    
    // convert into in standard time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12 )? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM":"PM"));
    }// end mend method toSrein
}//end class time1.
