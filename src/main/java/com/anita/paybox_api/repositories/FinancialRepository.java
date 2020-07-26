package com.anita.paybox_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

interface FinancialRepository extends JpaRepository<FinancialService, Long>{
    
}