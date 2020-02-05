package Strategy;

import java.util.List;

import ListConverterIF.ListConverterIF;

public class LineBreakThreeElement implements ListConverterIF {

	@Override
	public String listToString(List<String> l,int count) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder();
		String[] t = new String[l.size()];
		
		
		for(int i = 0; i<l.size(); i++) {
			//Välilyönti sanojen väliin
			t[i]=l.get(i)+" ";
		}
		
		for(int i = 0; i<t.length; i++) {
			builder.append(t[i]);
			if((i+1) %count == 0) {
				builder.append("\n");
			}
		}		
		return builder.toString();
	}

}
