public class StringTest {
   public static void main(String[] args) {
      String fly = "fly", weight = "weight";
      String fly2 = "fly", weight2 = "weight"; 

      System.out.println(fly == fly2);       // fly and fly2 refer to the same String instance
      System.out.println(weight == weight2); // weight and weight2 also refer to 
                                             // the same String instance

      String distinctString = fly + weight;
      System.out.println(distinctString == "flyweight"); // flyweight and "flyweight" do not
                                                         // refer to the same instance

      String flyweight = (fly + weight).intern();
      System.out.println(flyweight == "flyweight"); // the intern() method returns a flyweight


      //Omia testejä
      System.out.println("\nOmat Testit:");
      String testi ="flyweight";
      System.out.println(testi == "flyweight");//true

      System.out.println(testi.equals("flyweight"));//true
      System.out.println(distinctString.equals("flyweight"));//true
      System.out.println((fly+weight2)==(fly2+weight)); //False
      System.out.println((fly+weight)==(fly2+weight2));//false
      System.out.println((fly+weight)==(fly+weight));//False

      String testi2=fly+weight;
      String testi3=fly2+weight2;
      System.out.println((testi2==testi2));//true
      System.out.println(testi2==testi3);//false
      System.out.println(testi2.intern()==testi3.intern());

   }
}
