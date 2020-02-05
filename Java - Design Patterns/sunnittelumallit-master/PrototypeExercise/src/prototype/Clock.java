package prototype;



public class Clock implements Cloneable {

	PointerMin pointerMin;
	PointerHour pointerHour;
	
	int min;
	int hour;
	
	
	
	public Clock(PointerMin pointerMin, PointerHour pointerSec) {
		
		this.min=pointerMin.getPointer();
		this.hour=pointerSec.getPointer();
		
		this.pointerMin = pointerMin;
		this.pointerHour = pointerSec;
	}
	
	public void setTime(int hour, int min ) {
		pointerMin.setPointer(min);
		pointerHour.setPointer(hour);
	}
	
	public String stringTime() {
		//System.out.println("Hour: "+pointerHour.getPointer()+"\t Min: "+pointerMin.getPointer());
		return "Hour: "+pointerHour.getPointer()+"  Min: "+pointerMin.getPointer();
	}
	
	
	public Clock clone() {
		// syväkopio
		Clock s = null;
		try {
		s = (Clock)super.clone();
		s.pointerMin = (PointerMin)pointerMin.clone();
		s.pointerHour = (PointerHour)pointerHour.clone();
		} catch (CloneNotSupportedException e) {}
		return s;
		}
	
	
	
	
	
	
}
