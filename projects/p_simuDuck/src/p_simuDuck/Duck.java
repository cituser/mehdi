package p_simuDuck;

// the implemetation of this class care that all ducks quack and swim



/**
 * step 1
 * the implemetation of this abstract class care that all ducks quack and swim
 * 
 * @note Each duck subtype has to inherit this class and implement the method swin().
 * 
 * @author hafezi
 * 
 * @version  1.0
 * 
 *
 */
public abstract class Duck {
	
  public void quack(){
	  System.out.println("quack quack  quack ...");
	  
  }
  
  public void swim(){
	  
  }
  
  public abstract void display();

}
