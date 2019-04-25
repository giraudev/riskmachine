package com.giraudev.riskmachine.repository;

import com.giraudev.riskmachine.domain.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRepository extends JpaRepository<Risk, Long> {
}
