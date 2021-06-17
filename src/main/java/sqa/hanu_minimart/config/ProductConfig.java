package sqa.hanu_minimart.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sqa.hanu_minimart.model.Product;
import sqa.hanu_minimart.repository.ProductRepository;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProductConfig {

   @Bean
   CommandLineRunner commandLineRunner(ProductRepository productRepository){
       return args -> {
           Product bread = new Product("Bread", 2000, 2, "FOOD", LocalDate.now().plusDays(30), "https://assets.bonappetit.com/photos/5c62e4a3e81bbf522a9579ce/5:4/w_2815,h_2252,c_limit/milk-bread.jpg", "This is a bread", "new");
           Product candy = new Product("Candy", 10000, 10, "FOOD", LocalDate.now().plusDays(30), "https://sc04.alicdn.com/kf/H012b3ea0f9f74449b3f33e3b6ba7a2e77.jpg", "This is a candy", "hot");

           List item = new ArrayList();
           item.add(bread);
           item.add(candy);
           productRepository.saveAll(item);
       };
   }
}
