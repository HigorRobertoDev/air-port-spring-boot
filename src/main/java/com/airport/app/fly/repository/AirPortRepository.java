package com.airport.app.fly.repository;

import com.airport.app.fly.model.AirPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirPortRepository extends JpaRepository<AirPort, Long> {
}
