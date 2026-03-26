package se.lexicon;

public class Snack extends Product {
    private boolean isGlutenFree;
    private double netWeight;
    private int caloriesPerServing;

    public Snack(int id, String name, int price, int quantity, boolean isGlutenFree, double netWeight,
                 int caloriesPerServing) {
        super(id, name, price, quantity);
        this.isGlutenFree = isGlutenFree;
        this.netWeight = netWeight;
        this.caloriesPerServing = caloriesPerServing;
    }

    @Override
    public String getDescription() {
        return " | Gluten Free: " + isGlutenFree + " | Net.Weight: " + netWeight +
                " | Calories: " + caloriesPerServing;
    }
}
