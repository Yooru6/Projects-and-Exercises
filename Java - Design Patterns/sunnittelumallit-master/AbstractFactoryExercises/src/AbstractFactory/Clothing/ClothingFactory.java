package AbstractFactory.Clothing;

public class ClothingFactory {
    public static Clothing createClothing(ClothingAbstractFactory factory){

        return factory.createClothing();
    }
    
    
    public static Clothing makeClothing(String chosenFactory,String clothingType,String clothingColor,String clothingSize,double clothingPrice) {
    	Clothing a=null;
    	if(chosenFactory.equals("adidas")) {
    		a=ClothingFactory.createClothing(new AdidasFactory(clothingType, clothingColor, clothingSize, clothingPrice));
    		
    	}else if (chosenFactory.equals("boss")) {
    		a=ClothingFactory.createClothing(new BossFactory(clothingType, clothingColor, clothingSize, clothingPrice));
    	}if(a!=null) {
            return a;
    	}else {
    		return null;
    	}
    	
    	
    }
   
}
