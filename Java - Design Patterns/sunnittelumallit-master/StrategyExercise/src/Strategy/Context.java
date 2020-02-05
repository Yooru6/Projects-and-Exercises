package Strategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ListConverterIF.ListConverterIF;

public class Context {
	   private ListConverterIF strategy;
	     

	   public Context(ListConverterIF strategy){

	      this.strategy = strategy;
	      

	   }

	   public String executeStrategy(List<String> l,int count){
	      return strategy.listToString(l,count);
	   }
	   
	  //Read text file to List   
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
	   
	   }
	   
	