package com.foodexpress.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(RestaurantRepository repository) {
        return args -> {
            repository.save(new Restaurant("Paradise", "Biryani, Kebabs, Hyderabadi", 4.7, 30, "Secunderabad"));
            repository.save(new Restaurant("Bawarchi", "Biryani, Mutton, Hyderabadi", 4.6, 35, "RTC X Roads"));
            repository.save(new Restaurant("Mehfil", "Biryani, Kebabs, Hyderabadi", 4.5, 25, "Narayanguda"));
            repository.save(new Restaurant("Ideal Kitchen", "Biryani, Fried Rice, Chinese", 4.4, 20, "Koti"));
            repository.save(new Restaurant("Pista House", "Haleem, Biryani, Desserts", 4.7, 30, "Charminar"));
            repository.save(new Restaurant("Chutneys", "South Indian, Tiffins, Dosa", 4.5, 25, "Banjara Hills"));
            repository.save(new Restaurant("Alpha Hotel", "Biryani, Mutton Curry, Hyderabadi", 4.5, 40, "Secunderabad"));
            repository.save(new Restaurant("Karachi Bakery", "Bakery, Biscuits, Sweets", 4.8, 20, "Mozamjahi Market"));
            System.out.println("✅ Sample restaurants loaded successfully!");
        };
    }
}