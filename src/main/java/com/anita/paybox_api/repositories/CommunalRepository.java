package com.anita.paybox_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

interface CommunalRepository extends JpaRepository<CommunalPayment, Long>{
    
}