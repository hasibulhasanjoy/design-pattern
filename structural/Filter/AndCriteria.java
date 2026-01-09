
import java.util.List;

public class AndCriteria implements Criteria {
    private final Criteria first;
    private final Criteria second;

    public AndCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstResult = first.meetCriteria(persons);
        return second.meetCriteria(firstResult);
    }
}
