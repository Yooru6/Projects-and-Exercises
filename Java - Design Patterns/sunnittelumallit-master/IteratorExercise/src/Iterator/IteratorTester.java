package Iterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IteratorTester {

	List<String> lista;
	IteratorThread thread1;
	IteratorThread thread2;

    public IteratorTester(String name1,String name2) {
    	thread1=new IteratorThread(name1);
    	thread2=new IteratorThread(name2);
    	
        this.lista=new ArrayList(readTextFile());
        
    }
    
    public void startThreads() {
    	thread1.start();
    	thread2.start();
    }

	public List<String> readTextFile() {
		   List<String> list=new ArrayList<String>();
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader("src/dataSet.txt"));
				String line = reader.readLine();
				while (line != null) {
					list.add(line);

					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}return list;
		}
	
	public void removeFromList(int index) {
		lista.remove(index);
	}
	
	public void addToList(String add) {
		lista.add(add);
		
	}
	
	public void reverseList() {
		Collections.reverse(lista);
	}

	/**--------------------------------------------------------------------------**/

	   private class IteratorThread extends Thread implements Runnable{
		   String name;
		   
		   
		   
		   
		   public IteratorThread(String name) {
			this.name = name;
		}



		@Override
		   synchronized public void run() {
			ListIterator<String> iterator = lista.listIterator();
			
			   
	        //Start Guessing
	        try {
	            do {
	            	System.out.println(name+": "+iterator.next());
	                Thread.sleep(1);
	            } while(iterator.hasNext());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	
	        
	    }
		   }
	    

}
