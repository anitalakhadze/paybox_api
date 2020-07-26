package com.anita.paybox_api.repositories;
import com.anita.paybox_api.product_categories.FinancialService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRepository extends JpaRepository<FinancialService, Long>{
    
}