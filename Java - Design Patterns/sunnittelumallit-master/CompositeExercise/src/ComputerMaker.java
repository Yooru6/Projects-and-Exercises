
public interface ComputerMaker {
	
	/**Getters**/
	public String getName();
	public String getDescription();
	public int getID();
	public double getPrice();
	
	/**Function for composite class "Computer" -> Adds components to computer**/
	public void addComponent(ComputerMaker computerPart);
	
	/**Prints information of class**/
	public void printComponent();

}
