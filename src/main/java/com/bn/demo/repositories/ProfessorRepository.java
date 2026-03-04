package com.bn.demo.repositories;

import com.bn.demo.models.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {
}
