package Proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java.util.Scanner;

public class ExampleMain {
		static int pictureIndex;
	   public static void main(final String[] arguments) {
		   	List<Image> kuvat = new ArrayList();
		   	
		   	
		   	File[] imagefiles = new File("src/images").listFiles();
		   
		  for (File iFile : imagefiles) {
		      if (iFile.isFile()) {
		    	  //System.out.println(file.getName());
		          kuvat.add(new ProxyImage(iFile.getAbsolutePath()));
		      }
		  }
		   		        
	        
	        /**Picture Browsing**/
	        
	        Scanner scanner = new Scanner(System.in);
	        while(true) {
	        	
	            	            
	            System.out.println("\n\n------------------\n"
	            				+ "Pictures available:");
	            
	            int number=1;
	            for(Image i : kuvat) {
	            	
	            	System.out.print(number+". ");
		        	i.showData();
		        	number++;
		        }System.out.println("0. Exit program");
	            
	            
	            System.out.println("\nEnter number of the picture you want to open:");
	            
	            try {
	            	pictureIndex = scanner.nextInt();
	 	            if(pictureIndex==0) {
		            	System.out.println("Program Closed");
		            	System.exit(1);
		            }
	 	           kuvat.get(pictureIndex-1).displayImage();
	            }catch (Exception e){
	            	System.out.println("*********************************\n"
	            					+ "*Something went wrong try again!*"
	            					+ "\n*********************************");
	            }	            
	        }   
	    }
}

/**   
System.out.println("Valokuva kansion sisältö:");
for(Image i : kuvat) {
	i.showData();
}

ListIterator<Image> iterator = kuvat.listIterator();
while(iterator.hasNext()){
	iterator.next().displayImage();
}**/
