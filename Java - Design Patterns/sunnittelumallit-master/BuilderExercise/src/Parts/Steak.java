package Parts;

public class Steak implements PartsIF {
    private String type;

    public Steak(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Steak: "+ type;
    }
}

