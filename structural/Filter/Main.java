import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Rahim", "Male", "Single"));
        persons.add(new Person("Karim", "Male", "Married"));
        persons.add(new Person("Ayesha", "Female", "Single"));
        persons.add(new Person("Nila", "Female", "Married"));

        Criteria male = new MaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(male, single);

        List<Person> result = singleMale.meetCriteria(persons);

        for (Person r : result) {
            System.out.println(r.getName());
        }
    }
}
