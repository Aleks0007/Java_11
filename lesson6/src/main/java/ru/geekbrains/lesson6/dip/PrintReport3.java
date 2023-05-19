package ru.geekbrains.lesson6.dip;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintReport3 implements ReportOutputInterface {

    @Override
    public void output(List<ReportItem> items) {
        saveToFile(items);
    }

    public void saveToFile(List<ReportItem> items) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
            for (ReportItem item : items) {
                writer.write(String.format("%s - %f \n", item.getDescription(), item.getAmount()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
