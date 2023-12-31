package javacorehw03;

// 1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков - Freelancer) и 
// фиксированной оплатой (второй потомок -Worker).
// 
// а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
// Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка», 
// для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
// 
// б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
// 
// в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции (обратите ваше внимание на интерфейсы Comparator, Comparable), 
// добавьте новое состояние на урове базового типа и создайте свой уникальный компаратор.
// 
// г) ** Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer), и 
// реализовать возможность вывода данных с использованием foreach (подсказка: вам потребуется поработать с интерфейсом Iterable).

import java.util.Iterator;
import javacorehw03.Employee;
import javacorehw03.HourlyEmployee;
import javacorehw03.FixedEmployee;
import javacorehw03.Freelancer;
import javacorehw03.EmployeeCollection;

public class Main {
    public static void main(String[] args) {
        // Создание коллекции сотрудников
        EmployeeCollection employeeCollection = new EmployeeCollection();

        // Добавление сотрудников в коллекцию
        employeeCollection.addEmployee(new HourlyEmployee("Борис", 10));
        employeeCollection.addEmployee(new FixedEmployee("Екатерина", 5000));
        employeeCollection.addEmployee(new Freelancer("Изольда", 15, 100));

        // Сортировка сотрудников по заработной плате
        employeeCollection.sortEmployees();

        // Вывод данных с использованием foreach
        for (Employee employee : employeeCollection) {
            System.out.println("Имя: " + employee.name + ", Заработная плата: " + employee.calculateAverageMonthlySalary());
        }
    }
}
