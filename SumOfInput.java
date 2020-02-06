/**
 * Write a description of class SumOfInput here.
 *
 * @author (Maurice Russ)
 * @version (Version1)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        int j = 0;
        for(int i = 1; i <= numberToSum; i++){
        j = j += i;
        
        }
        return j;
    }

}
