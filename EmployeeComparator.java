package javacorehw03;

// EmployeeComparator - класс, реализующий компаратор для сортировки работников

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Сравниваем по среднемесячной заработной плате
        return Double.compare(emp1.calculateAverageMonthlySalary(), emp2.calculateAverageMonthlySalary());
    }
}