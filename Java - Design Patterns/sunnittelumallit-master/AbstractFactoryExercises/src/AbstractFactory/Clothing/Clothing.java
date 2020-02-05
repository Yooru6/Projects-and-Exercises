package AbstractFactory.Clothing;

public abstract class Clothing {

    public abstract String getClothingBrand();
    public abstract String getClothingType();
    public abstract String getClothingSize();
    public abstract String getClothingColor();
    public abstract double getClothingPrice();


    @Override
    public String toString(){
        return "\nType: "+this.getClothingType()+"\nBrand: "+this.getClothingBrand()+"\nColor: "+getClothingColor()+"\nSize: "+getClothingSize()+"\nPrice: "+getClothingPrice()+"€\n";
    }
}
