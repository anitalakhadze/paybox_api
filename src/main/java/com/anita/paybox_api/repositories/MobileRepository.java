package com.anita.paybox_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

interface MobileRepository extends JpaRepository<MobilePayment, Long>{
    
}