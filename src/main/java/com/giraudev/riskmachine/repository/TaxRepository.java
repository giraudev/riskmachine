package com.giraudev.riskmachine.repository;

import com.giraudev.riskmachine.domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, Long> {
}
