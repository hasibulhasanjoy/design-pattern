
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;

    private Meal(Builder builder) {
        this.items = builder.items;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item : " + item.name());
            System.out.println("Packing : " + item.packing().pack());
            System.out.println("Price : " + item.price());
            System.out.println("----------------------");
        }
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final List<Item> items = new ArrayList<>();

        public Builder addVegBurger() {
            items.add(new VegBurger());
            return this;
        }

        public Builder addChickBurger() {
            items.add(new ChickenBurger());
            return this;
        }

        public Builder addCoke() {
            items.add(new Coke());
            return this;
        }

        public Builder addPepsi() {
            items.add(new Pepsi());
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
