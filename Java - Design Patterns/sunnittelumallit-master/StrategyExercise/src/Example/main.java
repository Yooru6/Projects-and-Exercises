package Example;

import java.util.ArrayList;
import java.util.List;

import ListConverterIF.ListConverterIF;
import Strategy.Context;
import Strategy.LineBreakOneElement;
import Strategy.LineBreakThreeElement;
import Strategy.LineBreakTwoElement;
import Strategy.LineBreakUltimate;

public class main {
	
	private static List<String> list=new ArrayList<String>();
    private static ListConverterIF strats;
    private static ListConverterIF strats2;
    private static ListConverterIF strats3;
    private static ListConverterIF strats4;
	

    
    
    public static void main(String[] arg) 
    {
     
     System.out.println("**************\nONE:" );
     Context context1 = new Context(new LineBreakOneElement());
     list=context1.readTextFile();
     System.out.println(context1.executeStrategy(list,1));	
     
     System.out.println("**************\nTWO:" );
     Context context2 = new Context(new LineBreakTwoElement());
     System.out.println(context2.executeStrategy(list,2));
     
     System.out.println("**************\nThree:" );
     Context context3 = new Context(new LineBreakThreeElement());
     System.out.println(context3.executeStrategy(list,3));
     
     
     System.out.println("**************\nULTIMATE:" );
     Context context4 = new Context(new LineBreakUltimate());
     System.out.println(context4.executeStrategy(list,10));	
     

    }
	
}
