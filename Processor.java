
/**
 * Write a description of class Processor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Processor extends Component
{
    // instance variables - replace the example below with your own
    //private int cost;
    //private String discreption;
    private int speed;

    /**
     * Constructor for objects of class Processor
     */
    public Processor(){
    }
    public Processor(int cost, String discreption,int speed)
    {
        super(cost,discreption);
        this.speed=speed;// inthitialise instance variables
        
    }

    
}
