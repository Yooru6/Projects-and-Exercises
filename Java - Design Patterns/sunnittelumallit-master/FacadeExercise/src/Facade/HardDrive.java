package Facade;

import java.util.Random;

public class HardDrive {
	
	private byte[] byteData;
    public byte[] read(long lba, int size) {
    	byteData = new byte[size];
    	
    	
    	Random random=new Random();
    	
    	random.nextBytes(byteData);
    	System.out.println("Some data from sector: "+lba+" With size:"+size+" bytes:"+byteData);
		return byteData;  }
}
//https://www.geeksforgeeks.org/random-nextbytes-method-in-java-with-examples/
//https://docs.oracle.com/javase/7/docs/api/java/util/Random.html