public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Meal("Steak");
        Meal meal2 = new Meal("Chicken", "Fries");
        Meal meal3 = new Meal("Fish", "Rice", "Soda");
        Meal meal4 = new Meal("Pasta", "Salad", "Wine", true);

        System.out.println(meal1);
        System.out.println(meal2);
        System.out.println(meal3);
        System.out.println(meal4);
    }
}
