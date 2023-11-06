package javacorehw03;

// EmployeeCollection - класс, содержащий массив сотрудников и реализующий возможность сортировки и вывода данных

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCollection implements Iterable<Employee> {
    private List<Employee> employees; // Массив сотрудников

    // Конструктор
    public EmployeeCollection() {
        employees = new ArrayList<>();
    }

    // Метод для добавления сотрудника в коллекцию
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для сортировки сотрудников
    public void sortEmployees() {
        Collections.sort(employees, new EmployeeComparator());
    }

    // Реализация метода интерфейса Iterable
    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}