package com.csidigital.rh.dao.repository;

import com.csidigital.rh.dao.entity.Employee;
import com.csidigital.rh.dao.entity.Offer;
import com.csidigital.rh.shared.enumeration.EmployeeStatus;
import com.csidigital.rh.shared.enumeration.OfferStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer,Long> {

    @Modifying
    @Query(value = " UPDATE offer SET offer_status = 'OPEN' WHERE id =:id", nativeQuery = true)
    void updateStatusToOpenById(@Param("id") Long id);

    @Modifying
    @Query(value = " UPDATE offer SET offer_status = 'ENDED' WHERE id =:id", nativeQuery = true)
    void updateStatusToEndedById(@Param("id") Long id);

    //filtrer les offreq selon leurs status
    List<Offer> findByOfferStatus(OfferStatus offerStatus);
}
