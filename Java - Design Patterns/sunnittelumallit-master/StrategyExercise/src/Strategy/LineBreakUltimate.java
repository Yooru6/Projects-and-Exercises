package Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import ListConverterIF.ListConverterIF;

public class LineBreakUltimate implements ListConverterIF {

	@Override
	public String listToString(List<String> l, int count) {
       String returnString="";
       
       int elementCount=count;
        
        ListIterator iterator = l.listIterator(); 
  
        while (iterator.hasNext()) { 
            returnString+=iterator.next()+", ";
            
            if(iterator.nextIndex()%elementCount==0)
            	returnString+="\n";
	}
        return returnString;

}
}
