
/**
 * Write a description of class Problem5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem5
{
    public static void main(String [] args) {
    sampleMethod(30);
    sampleMethod(51);
    sampleMethod(60);
    System.out.println("Temperature 30 is a good test to show the code is broken as it outputs 'warm' when it should be 'cold'");
    }
    
    public static void sampleMethod(int temp)
    {
        String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51) {
         weather = "moderate";
        }
        else {
        weather = "warm";
        }
        System.out.println(weather);
        
    }

}
