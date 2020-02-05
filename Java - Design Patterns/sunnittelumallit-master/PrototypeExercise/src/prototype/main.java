package prototype;

public class main {

	public static void main(String[] arg) {
		PointerHour hourPointer = new PointerHour();
		PointerMin minPointer = new PointerMin();
		
		Clock clock = new Clock(minPointer,hourPointer);
		clock.setTime(4, 55);
		
		System.out.println("Original Clock:"+clock.stringTime());
		
		
		Clock clock2 = clock.clone();
		System.out.println("Cloned the clock and printing time of both clocks\n\n"
				+ "Original: "+clock.stringTime()+"\n"
				+ "Cloned: " +clock2.stringTime());
				
		clock.setTime(3, 20);
		System.out.println("\n changed time of original clock to 3:20...and printing both clocks\n\n"
				+ "Original: "+clock.stringTime()+"\n"
				+ "Cloned: " +clock2.stringTime());
		
		
		clock2.setTime(12, 00);
		System.out.println("\n changed time of cloned clock to 12:00...and printing both clocks\n\n"
				+ "Original: "+clock.stringTime()+"\n"
				+ "Cloned: " +clock2.stringTime());
		
		
	}
	     
	
}
