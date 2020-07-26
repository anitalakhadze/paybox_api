package com.anita.paybox_api.repositories;
import com.anita.paybox_api.product_categories.CharityPayment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharityRepository extends JpaRepository<CharityPayment, Long>{
    
}