package de.aittr.iocdemo;

import org.springframework.stereotype.Component;

@Component
public class InternetDeliveryService {
    public void deliveryMessage() {
        TCPConnection connection = new TCPConnection();
        System.out.println("Internet delivery");
        connection.init();
        connection.send();
        connection.close();
        System.out.printf("delivered");

    }
}
