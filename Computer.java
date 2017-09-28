
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer
{
    // instance variables - replace the example below with your own
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;

    /**
     * Constructor for objects of class Computer
     */
    public Computer(){
        
       theProcessor = new Processor();
       theHardDisk= new HardDisk();
       theDisplay= new Display();
        
    }
    
    public boolean addComputer(Computer newComputer) {
    
    return true;
    
    }
    
    public boolean removeComputer(int index) {
    
    return true;
    
    }
    
    public void printComputerSummary() {
	
        
    }
    
    public void printAllComputers( ) {
	
    }

    public void printTotalValue( ) {
	
        
        
    }
    
}
