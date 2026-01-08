public class Main {
    public static void main(String[] args) {
        Meal meal1 = Meal.builder().addVegBurger().addCoke().build();
        meal1.showItems();
    }
}
