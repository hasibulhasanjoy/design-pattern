public class Meal {
    private String mainItem; // required
    private String sideItem; // optional
    private String drink; // optional
    private boolean dessert; // optional

    public Meal(String mainItem) {
        this.mainItem = mainItem;
    }

    public Meal(String mainItem, String sideItem) {
        this.mainItem = mainItem;
        this.sideItem = sideItem;
    }

    public Meal(String mainItem, String sideItem, String drink) {
        this.mainItem = mainItem;
        this.sideItem = sideItem;
        this.drink = drink;
    }

    public Meal(String mainItem, String sideItem, String drink, boolean dessert) {
        this.mainItem = mainItem;
        this.sideItem = sideItem;
        this.drink = drink;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal{ mainItem=" + mainItem
                + ", sideItem=" + sideItem
                + ", drink=" + drink
                + ", dessert=" + dessert + " }";
    }
}
