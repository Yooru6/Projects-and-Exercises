package prototype;

public class PointerHour implements Cloneable {
	private final int secMAX=60;
	private int hourPointer;
	public PointerHour() {		
		this.hourPointer=0;
	}
	
	public void setPointer(int sec) {
		if (sec>secMAX)
			System.out.println("Second pointer value is invalid");
		else {
		this.hourPointer=sec;
		}
	}
	
	public int getPointer() {
		return hourPointer;
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
