import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> results = new ArrayList<>();

        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("female")) {
                results.add(p);
            }
        }
        return results;
    }
}
