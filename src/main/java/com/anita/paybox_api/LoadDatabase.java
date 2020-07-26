package com.anita.paybox_api;
import com.anita.paybox_api.repositories.MobileRepository;
import com.anita.paybox_api.product_categories.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

  private static final Logger log = 
    LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(MobileRepository repository) {
      return args -> {
        log.info("Preloading " + 
            repository.save(new MobilePayment
            ("598", 12.2, 1.1)));
        log.info("Preloading " + 
            repository.save(new MobilePayment
            ("557", 15.2, 1.3)));
      };
    }
  }