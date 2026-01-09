import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> results = new ArrayList<>();

        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("male")) {
                results.add(p);
            }
        }
        return results;
    }
}
