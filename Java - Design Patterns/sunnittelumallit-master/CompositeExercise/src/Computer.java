import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer implements ComputerMaker {

	private int id;
	private String  name;
	private String description;
	private double price;
	List<ComputerMaker> components = new ArrayList<ComputerMaker>();  
	
	
	
	
	public Computer(int id, String name, String specs) {
		super();
		this.id = id;
		this.description = specs;
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getID() {
		return id;
	}
	
	@Override
	public double getPrice() {
		
		Iterator<ComputerMaker> it = components.iterator();
        while(it.hasNext())  {  
            ComputerMaker component = it.next();
            price+=component.getPrice();
		}

		return price;
	}

	@Override
	public void addComponent(ComputerMaker computerPart) {
		components.add(computerPart);		
	}

	@Override
	public void printComponent() {
        System.out.println("**************************");  
        System.out.println("Name = "+getName());  
        System.out.println("Description = "+getDescription());
        System.out.println("Total Price = "+getPrice());
        System.out.println("**************************\n");
        System.out.println("---	COMPONENTS	---\n");
        
    	Iterator<ComputerMaker> it = components.iterator();  
        while(it.hasNext())  {  
            ComputerMaker component = it.next();  
            component.printComponent();  
        
	}
	
	

     }  

}
