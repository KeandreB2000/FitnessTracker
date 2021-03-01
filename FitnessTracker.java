/*Create an additional overloaded constructor for the FitnessTracker class you created in Exercise.
This constructor receives parameters for each of the data fields and assigns them appropriately. 
Add any needed statements to the TestFitnessTracker application to ensure that the overloaded constructor works correctly, save it, and then test it.
**
 */
package testfitnesstracker;

import java.time.LocalDate;
import java.time.Month;

/**
 *date 2/3/21
 * @author keeskothemagician
 */
public class FitnessTracker 
{
    String activity;     // input my variables
    int minutes;
    LocalDate date;
    
    public FitnessTracker (String activityName, int minutes, LocalDate dateValue) 
    {
        activity = activityName;        // input my variables
        this.minutes = minutes;
        date = dateValue;
    }
    
    public FitnessTracker()
    {
        this("hiking ", 25, LocalDate.of(2021, 1, 1));
    }
    
    public String getActivity()
    {
        return activity;  // returning the activity
    }
    
    public int getMinutes()
    {
        return minutes;      // returning the minutes
    }
    
    public LocalDate getDate()
    {
        return date;  // returning the date
    }

}
