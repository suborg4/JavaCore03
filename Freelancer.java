package javacorehw03;

// Freelancer - класс, описывающий фрилансера (потомок класса HourlyEmployee)

public class Freelancer extends HourlyEmployee {
    private int hoursWorked; // Количество отработанных часов

    // Конструктор
    public Freelancer(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    // Реализация метода для расчета среднемесячной заработной платы
    @Override
    public double calculateAverageMonthlySalary() {
        return super.calculateAverageMonthlySalary() * hoursWorked;
    }
}