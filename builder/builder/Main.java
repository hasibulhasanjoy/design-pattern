public class Main {
    public static void main(String[] args) {
        Meal m1 = new Meal.Builder("burger").sideItem("fries").drink("coke").desert(true).build();

        Meal m2 = new Meal.Builder("rice").build();

        System.out.println(m1);
        System.out.println(m2);
    }
}
