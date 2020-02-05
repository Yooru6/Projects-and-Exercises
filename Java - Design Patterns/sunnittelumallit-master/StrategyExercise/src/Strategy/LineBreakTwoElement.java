package Strategy;

import java.util.List;

import ListConverterIF.ListConverterIF;

public class LineBreakTwoElement implements ListConverterIF {

	@Override
	public String listToString(List<String> l, int count) {
		//Lista objekti taulukoksi
		Object[] objects = l.toArray();
		StringBuffer s = new StringBuffer();
		
		int elementCount=count;

		for(int i = 0; i < objects.length; i++) {			
			String item=objects[i].toString();
			
			for(int j = 0; j < item.length(); ++j) {
				//Parittomat kirjaimet
				if((j+1) % elementCount > 0) {					
					s.append(item.charAt(j));
				//Parilliset kirjaimet
				}else {	
					s.append(item.charAt(j)+"\n");					
				}
			}
			//Jos sanan pituus pariton
			if(item.length()%elementCount!=0) {
				s.append("\n");
			}
	}
		return s.toString();
}
}

