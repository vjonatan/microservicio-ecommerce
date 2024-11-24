package com.msvc.inventario;

import com.msvc.inventario.model.Inventario;
import com.msvc.inventario.repository.InventarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioServiceApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner loadData(InventarioRepository inventarioRepository){
		return args -> {

			Inventario inventario1 = Inventario.builder()
					.codigoSku("iphone_x")
					.cantidad(100)
					.build();

			Inventario inventario2 = Inventario.builder()
					.codigoSku("iphone_15")
					.cantidad(0)
					.build();

			Inventario inventario3 = Inventario.builder()
					.codigoSku("samsung_s23")
					.cantidad(5)
					.build();

			Inventario inventario4 = Inventario.builder()
					.codigoSku("samsung_s24")
					.cantidad(15)
					.build();

			inventarioRepository.save(inventario1);
			inventarioRepository.save(inventario2);
			inventarioRepository.save(inventario3);
			inventarioRepository.save(inventario4);
		};
	}*/

}
