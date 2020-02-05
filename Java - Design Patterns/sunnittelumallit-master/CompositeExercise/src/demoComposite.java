
public class demoComposite {

    public static void main(String args[]){
    	
    	/**Composite**/
        ComputerMaker computer=new Computer(0,"Acer","Desktop Computer"); 
        
        /**Leafs**/
    	ComputerMaker computerCase = new Case(1,"Super Case 6000","ddr4", 200.0) ;
        ComputerMaker ram=new Ram(2,"Kingston hyperX","ddr4", 200.0);  
        ComputerMaker cpu=new Cpu(3,"Intel Skylake X","4,2ghz", 259.0);  
        ComputerMaker gpu=new Gpu(4,"Gigabyte GeForce RTX 5000","RTX9000", 1500.0);
 
        /**Components to computer**/
        computer.addComponent(computerCase);
        computer.addComponent(ram);  
        computer.addComponent(cpu);  
        computer.addComponent(gpu);  
        computer.printComponent();
         //ram.printComponent();
       }  
}
