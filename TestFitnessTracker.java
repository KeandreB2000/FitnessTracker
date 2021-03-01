/*
*Create a FitnessTracker class that includes data fields for a fitness activity, the number of minutes spent participating, and the date. 
*The class includes methods to get each field. In addition, create a default constructor that automatically sets the activity to running, the minutes to 0, and the 
date to January 1 of the current year.
 */
package testfitnesstracker;

import java.time.LocalDate;

/**
 *date 2/3/21
 * @author keeskothemagician
 */
public class TestFitnessTracker 
{
    public static void main(String[] args) 
    {  
      FitnessTracker training = new FitnessTracker();  // input my variable
      
      System.out.println(training.getActivity() + ": " + training.getMinutes() + " Minutes on " + training.getDate());  // print out the minutes of the training
      
      LocalDate date = LocalDate.of(2021, 1, 15);
      FitnessTracker training2 = new FitnessTracker(" lifting weights ", 45, date);  
      
      System.out.println(training2.getActivity() + ": " + training2.getMinutes() + " Minutes on " + training2.getDate());  // printing out the minutes of training 2
    
    }
    
}
