package de.aittr.iocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.processing.Messager;

import static org.apache.logging.slf4j.SLF4JLoggerContextFactory.context;

@SpringBootApplication
public class IocdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(IocdemoApplication.class, args);

		/*
		Connection connection = new TCPConnection();
		//DeliveryService internetDeliveryService = new InternetDeliveryService();
		DeliveryService internetDeliveryService = new InternetDeliveryService(connection);
		Messenger messenger = new Messenger(internetDeliveryService);
		messenger.sendMessage("hello");
		 */
		Messenger messenger = context.getBan(Messenger.class);
		messenger.sendMessage("hello");

	}
}
