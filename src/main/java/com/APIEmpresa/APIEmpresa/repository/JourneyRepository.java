package com.APIEmpresa.APIEmpresa.repository;

import com.APIEmpresa.APIEmpresa.models.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkingDay, Long> {

}
