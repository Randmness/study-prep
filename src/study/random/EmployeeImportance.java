package study.random;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> empMap = new HashMap<>();
        for (Employee emp: employees) {
            empMap.put(emp.id, emp);
        }

        return helper(id, empMap);
    }

    public int helper(Integer id, Map<Integer, Employee> map) {
        Employee employee = map.get(id);
        if (employee== null ||
                employee.subordinates == null || employee.subordinates.isEmpty()) return 0;

        int importance = employee.importance;

        for (int subordinate: employee.subordinates) {
            importance+=helper(subordinate, map);
        }

        return importance;
    }
}
