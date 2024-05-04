package com.microservices.inventoryservice;

import com.microservices.inventoryservice.model.InventoryModel;
import com.microservices.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			InventoryModel inventory = new InventoryModel();
			inventory.setSkuCode("iphone_15");
			inventory.setQuantity(1200);

			InventoryModel inventory1 = new InventoryModel();
			inventory1.setSkuCode("iphone_14");
			inventory1.setQuantity(200);

			InventoryModel inventory2 = new InventoryModel();
			inventory2.setSkuCode("iphone_11");
			inventory2.setQuantity(4000);


		};
	}
}
