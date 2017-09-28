
/**
 * Write a description of class HardDisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardDisk extends Component
{
    // instance variables - replace the example below with your own
    int capacity;

    /**
     * Constructor for objects of class HardDisk
     */
    
    public HardDisk(){
    }
    
    public HardDisk(int cost, String discreption,int capacity)
    {
        super(cost,discreption);
        this.capacity=capacity;// initialise instance variables
     
    }

    
}
