package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Rate;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {
	Rate findByCountry(String country);
}
