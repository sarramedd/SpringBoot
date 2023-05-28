package com.csidigital.rh.dao.repository;

import com.csidigital.rh.dao.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation , Long> {
}
