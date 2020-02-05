package prototype;

public class PointerMin implements Cloneable {
	
	private final int minMAX=60;
	private int minPointer;
	
	public PointerMin() {		
		this.minPointer=0;
		
	}
	
	
	public void setPointer(int min) {
		if (min>minMAX)
			System.out.println("Second pointer value is invalid");
		else {
		this.minPointer=min;
		}
	}
	
	public int getPointer() {
		return minPointer;
	}
	
	public Object clone() {
		//matalakopio:
		try {
		return super.clone();
		} catch (CloneNotSupportedException e) {
		return null;
		}
		}

}
