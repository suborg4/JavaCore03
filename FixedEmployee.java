package javacorehw03;

// FixedEmployee - класс, описывающий работника с фиксированной оплатой (потомок класса Employee)

public class FixedEmployee extends Employee {
    private double fixedSalary; // Фиксированная месячная оплата

    // Конструктор
    public FixedEmployee(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    // Реализация метода для расчета среднемесячной заработной платы
    @Override
    public double calculateAverageMonthlySalary() {
        return fixedSalary;
    }
}