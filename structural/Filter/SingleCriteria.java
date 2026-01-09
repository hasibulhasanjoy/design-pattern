import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();

        for (Person p : persons) {
            if (p.getMaritalStatus().equalsIgnoreCase("Single")) {
                result.add(p);
            }
        }
        return result;
    }
}
