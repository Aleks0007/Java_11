package ru.geekbrains.lesson6.dip;

public class Program {

    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();

        // выбор метода вывода в зависимости от потребностей
        report.setOutputMethod(new PrintReport()); // для печати
        report.output();

        report.setOutputMethod(new PrintReport2()); // для другого вида печати
        report.output();

        report.setOutputMethod(new PrintReport3()); // для сохранения в файл
        report.output();
    }
}
