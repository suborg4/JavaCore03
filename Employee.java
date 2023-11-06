package javacorehw03;

// Employee - базовый класс, описывающий работника

public abstract class Employee {
    protected String name; // Имя работника

    // Конструктор
    public Employee(String name) {
        this.name = name;
    }

    // Абстрактный метод для расчета среднемесячной заработной платы
    public abstract double calculateAverageMonthlySalary();
}