
public class Ram implements ComputerMaker {
	private final String type="RAM";
	private int id;
	private String  name;
	private String specs;
	private double price;
	
	
	public Ram(int id, String name, String specs, double price) {
		this.id = id;
		this.specs = specs;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return specs;
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void addComponent(ComputerMaker computerPart) {}

	@Override
	public void printComponent() {
        System.out.println("==="+type+"===");  
        System.out.println("Id ="+getID());  
        System.out.println("Name ="+getName());  
        System.out.println("Specs ="+getDescription());
        System.out.println("Price ="+getPrice());
        System.out.println("\n");
		
	}

}
