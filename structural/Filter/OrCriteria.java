import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria first;
    private final Criteria second;

    public OrCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>(first.meetCriteria(persons));

        for (Person p : second.meetCriteria(persons)) {
            if (!result.contains(p)) {
                result.add(p);
            }
        }
        return result;
    }
}
