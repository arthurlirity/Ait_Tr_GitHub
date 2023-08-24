package de.aittr.iocdemo;

import org.springframework.stereotype.Component;

@Component

public class TestDeliveryService implements DeliveryService {
    public void deliveryMessage(){
        System.out.println("DeliveryService Work");
        System.out.printf("fake connection");
    }
}
