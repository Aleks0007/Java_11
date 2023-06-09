package ru.geekbrains.lesson6.dip;

import java.util.List;

public class PrintReport2 implements ReportOutputInterface {

    @Override
    public void output(List<ReportItem> items) {
        printAll(items);
    }

    public void printAll(List<ReportItem> items) {
        System.out.println("Output to printer 2");
        for (ReportItem item : items) {
            System.out.format("printer 2 %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
