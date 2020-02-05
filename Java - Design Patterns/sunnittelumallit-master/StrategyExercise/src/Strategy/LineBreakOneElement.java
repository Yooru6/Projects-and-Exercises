package Strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ListConverterIF.ListConverterIF;

public class LineBreakOneElement implements ListConverterIF {

	@Override
	public String listToString(List<String> l,int count) {

		char[] arrSplit;
		
		StringBuilder builder = new StringBuilder();

		ListIterator<String> iterator = l.listIterator();
	    
		while (iterator.hasNext()) {
				
	            arrSplit =iterator.next().replaceAll("|","\n").substring(1).toCharArray();
	            
	            builder.append(arrSplit);
	    }
		return builder.toString();
	}
}
