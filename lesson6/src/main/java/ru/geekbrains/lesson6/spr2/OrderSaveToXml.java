package ru.geekbrains.lesson6.spr2;

import java.io.PrintWriter;
import java.io.IOException;

public class OrderSaveToXml implements IOrderSaver {

    @Override
    public void save(Order order) {
        try (PrintWriter out = new PrintWriter("order.xml")) {
            out.println("<Order>");
            out.println("    <clientName>" + order.getClientName() + "</clientName>");
            out.println("    <product>" + order.getProduct() + "</product>");
            out.println("    <qnt>" + order.getQnt() + "</qnt>");
            out.println("    <price>" + order.getPrice() + "</price>");
            out.println("</Order>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}