
/**
 * Write a description of class Component here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Component
{
    // instance variables - replace the example below with your own
    private int cost;
    private String discreption;

    /**
     * Constructor for objects of class Component
     */
    public Component(){
       }
    public Component(int cost, String descreption)
    {
        this.cost=cost;
        this.discreption=descreption;
    }

    public int getCost(){
    return cost;
    }
    
    public String getDiscrepyion(){
    return discreption;
    }
}
