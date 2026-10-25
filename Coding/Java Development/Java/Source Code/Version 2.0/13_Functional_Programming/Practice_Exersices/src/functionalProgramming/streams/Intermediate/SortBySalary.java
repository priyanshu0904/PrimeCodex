package functionalProgramming.streams.Intermediate;

import java.util.List;

public class SortBySalary {
    private final String name;
    private final int salary;

    public SortBySalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortBySalary{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
