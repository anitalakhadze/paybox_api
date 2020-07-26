package com.anita.paybox_api.repositories;
import com.anita.paybox_api.product_categories.MobilePayment;

import org.springframework.data.jpa.repository.JpaRepository;

interface MobileRepository extends JpaRepository<MobilePayment, Long>{
    
}