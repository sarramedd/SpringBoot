package com.csidigital.rh.dao.repository;

import com.csidigital.rh.dao.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education , Long> {
}
