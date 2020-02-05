package AbstractFactory.Clothing;

public class BossFactory implements ClothingAbstractFactory {
    private String clothingBrand;
    private String clothingType;
    private String clothingColor;
    private String clothingSize;
    private double clothingPrice;

    public BossFactory(String clothingType, String clothingColor, String clothingSize, double clothingPrice) {
        this.clothingType = clothingType;
        this.clothingColor = clothingColor;
        this.clothingSize = clothingSize;
        this.clothingPrice = clothingPrice;


    }

    @Override
    public Clothing createClothing() {

        return new Boss(clothingType,clothingColor,clothingSize,clothingPrice);
    }

	@Override
	public Clothing makeClothing() {
		// TODO Auto-generated method stub
		return null;
	}
}

