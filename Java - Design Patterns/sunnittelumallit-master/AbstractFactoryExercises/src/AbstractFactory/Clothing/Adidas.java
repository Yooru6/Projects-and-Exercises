package AbstractFactory.Clothing;

public class Adidas extends Clothing {

    private String clothingBrand;
    private String clothingType;
    private String clothingColor;
    private String clothingSize;
    private double clothingPrice;

    public Adidas(String clothingType, String clothingColor, String clothingSize, double clothingPrice) {
        this.clothingType = clothingType;
        this.clothingColor = clothingColor;
        this.clothingSize = clothingSize;
        this.clothingPrice = clothingPrice;
        this.clothingBrand = "Adidas";
    }

    @Override
    public String getClothingBrand() {
        return clothingBrand;
    }

    @Override
    public String getClothingType() {
        return clothingType;
    }


    @Override
    public String getClothingColor() {
        return clothingColor;
    }

    @Override
    public String getClothingSize() {
        return clothingSize;
    }

    @Override
    public double getClothingPrice() {
        return clothingPrice;
    }
    



}