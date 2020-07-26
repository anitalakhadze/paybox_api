package com.anita.paybox_api.repositories;
import com.anita.paybox_api.product_categories.CommunalPayment;

import org.springframework.data.jpa.repository.JpaRepository;

interface CommunalRepository extends JpaRepository<CommunalPayment, Long>{
    
}