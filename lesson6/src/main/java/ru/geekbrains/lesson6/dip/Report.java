package ru.geekbrains.lesson6.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {

    private List<ReportItem> items;	// Отчетные данные
    private ReportOutputInterface reportOutput; // заменяем PrintReport на интерфейс

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        reportOutput.output(items);
    }

    // вводим метод для установки конкретной реализации вывода отчета
    public void setOutputMethod(ReportOutputInterface reportOutput) {
        this.reportOutput = reportOutput;
    }
}