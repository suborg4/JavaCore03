package javacorehw03;

// HourlyEmployee - класс, описывающий работника с почасовой оплатой (потомок класса Employee)

public class HourlyEmployee extends Employee {
    private double hourlyRate; // Почасовая ставка

    // Конструктор
    public HourlyEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    // Реализация метода для расчета среднемесячной заработной платы
    @Override
    public double calculateAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}