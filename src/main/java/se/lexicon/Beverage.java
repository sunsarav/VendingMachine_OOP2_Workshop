package se.lexicon;

public class Beverage extends Product{
    private int volume;
    private boolean isCarbonated;
    private double sugarContent;

    public Beverage(int id, String name, int price, int quantity, int volume, boolean isCarbonated,
                    double sugarContent) {
        super(id, name, price, quantity);
        this.volume = volume;
        this.isCarbonated = isCarbonated;
        this.sugarContent = sugarContent;
    }

    @Override
    public String getDescription() {
        String type = isCarbonated ? "Sparkling" : "Still";
        return " | Volume: " + volume + " | Carbonated: " + isCarbonated + " | Sugar-Content: "
                + sugarContent;
    }
}
