package Iterator;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Two Iterators iterating same Collection at the same time");
		IteratorTester testerSameCollection = new IteratorTester("Same1","Same2");
		testerSameCollection.startThreads();
		
		
		System.out.println("Two Threads using same iterator one after another");
		IteratorTesterSameIterator oneAfterAnother = new IteratorTesterSameIterator("afteAnother1","afterAnother2");
		oneAfterAnother.startThreads();
		Thread.sleep(3000);
		oneAfterAnother.reverseList();
		oneAfterAnother.iteratorRemove();
		//oneAfterAnother.iteratorRemove();
		
		
		
		System.out.println("Editing Collection while iterator running");
		IteratorTester testerWhileRunning = new IteratorTester("editing1","editing2");
		Thread.sleep(1000);
		testerWhileRunning.startThreads();
		testerWhileRunning.reverseList();
		testerWhileRunning.removeFromList(3);
		testerWhileRunning.addToList("WUUUT");
		
		oneAfterAnother.iteratorRemove();
		

	}
}
