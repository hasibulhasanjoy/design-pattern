public class Meal {
    private final String mainItem; // required
    private final String sideItem; // optional
    private final String drink; // optional
    private final boolean desert; // optional

    private Meal(Builder builder) {
        this.mainItem = builder.mainItem;
        this.sideItem = builder.sideItem;
        this.drink = builder.drink;
        this.desert = builder.desert;
    }

    public static class Builder {
        private final String mainItem;
        private String sideItem = "";
        private String drink = "";
        private boolean desert = false;

        public Builder(String mainItem) {
            this.mainItem = mainItem;
        }

        public Builder sideItem(String sideItem) {
            this.sideItem = sideItem;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder desert(boolean desert) {
            this.desert = desert;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }

    @Override
    public String toString() {
        return "Meal{ mainItem=" + mainItem
                + ", sideItem=" + sideItem
                + ", drink=" + drink
                + ", dessert=" + desert + " }";
    }
}
