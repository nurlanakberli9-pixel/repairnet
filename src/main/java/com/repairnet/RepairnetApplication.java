package com.repairnet;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.service.RepairShopService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RepairnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepairnetApplication.class, args);
	}


//	@Bean
//	CommandLineRunner run(RepairShopService service) {
//		return args -> {
//			RepairShopDto repairShopDto=new RepairShopDto();
//			service.creatRepairShop(repairShopDto);
//		};
//
//    }
}
