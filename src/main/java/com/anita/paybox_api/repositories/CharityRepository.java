package com.anita.paybox_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

interface CharityRepository extends JpaRepository<CharityPayment, Long>{
    
}