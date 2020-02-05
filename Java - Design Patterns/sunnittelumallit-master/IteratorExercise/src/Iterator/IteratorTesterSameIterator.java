package Iterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IteratorTesterSameIterator {

	List<String> lista;
	IteratorThread thread1;
	IteratorThread2 thread2;
	ListIterator<String> iterator;
	ResourceLock lock;

    public IteratorTesterSameIterator(String name1,String name2) {
    	lock = new ResourceLock();
    	thread1=new IteratorThread(lock,name1);
    	thread2=new IteratorThread2(lock,name2);
    	
    	
        this.lista=new ArrayList(readTextFile());
        iterator=lista.listIterator();
        
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
	
	public void iteratorRemove() {
		iterator.remove();
	}

	/**--------------------------------------------------------------------------**/

	   private class IteratorThread extends Thread implements Runnable{
		   ResourceLock lock;
		   String name;
		   
		   
		   public IteratorThread(ResourceLock lock,String name) {
			   this.name=name;
			   this.lock = lock;
		}

		@Override
		   synchronized public void run() {
			   
	        //Start Guessing
	        try {
	            do {
	            	
	            	synchronized (lock) {

	    					while(lock.flag!=1){
	    						lock.wait();
	    					}

	    					System.out.println(name+": "+iterator.next());
	    					Thread.sleep(300);
	    					lock.flag = 2;
	    					lock.notifyAll();
	    				}
	            		                
	            } while(iterator.hasNext());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }
		   	    
}
	   
	   
	   private class IteratorThread2 extends Thread implements Runnable{
		   ResourceLock lock;
		   String name;
		   
		   public IteratorThread2(ResourceLock lock,String name) {
			   this.name=name;
			   this.lock = lock;
		}
		   @Override
		   synchronized public void run() {
			   
	        //Start Guessing
	        try {
	            do {
	            	
	            	synchronized (lock) {

	    					while(lock.flag!=2){
	    						lock.wait();
	    					}

	    					System.out.println(name+": "+iterator.next());
	    					Thread.sleep(300);
	    					lock.flag = 1;
	    					lock.notifyAll();
	    				}
	            	
	                
	            } while(iterator.hasNext());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }
		   	    
}
	   //Lukko threadeille
	   public class ResourceLock{
		   	public volatile int flag = 1;
		   }
		   
}
