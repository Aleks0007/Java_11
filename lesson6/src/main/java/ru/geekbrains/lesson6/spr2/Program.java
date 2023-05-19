package ru.geekbrains.lesson6.spr2;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        
        OrderInput orderInput = new OrderInput();
        Order order = orderInput.inputFromConsole();
        
        OrderSaver orderSaver = new OrderSaver();
        orderSaver.saveToJson(order);
        
        OrderSaveToXml orderSaveToXml = new OrderSaveToXml();
        orderSaveToXml.save(order);
    }

}
