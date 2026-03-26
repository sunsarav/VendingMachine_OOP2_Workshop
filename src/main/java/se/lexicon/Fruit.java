package se.lexicon;

public class Fruit extends Product{
    private int weightPerPiece;
    private String ripeness;

    public Fruit(int id, String name, int price, int quantity, int weightPerPiece, String ripeness) {
        super(id, name, price, quantity);
        this.weightPerPiece = weightPerPiece;
        this.ripeness = ripeness;
    }

    @Override
    public String getDescription() {
        return " | Weight: " + weightPerPiece + "gm" + " | Ripeness: " + ripeness;
    }
}
