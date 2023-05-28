package com.csidigital.rh.dao.entity;


import com.csidigital.rh.shared.enumeration.OfferStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Offer {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String reference;
    private String description ;
    private String requiredSkills ;
    private Long requiredExperienceAmount ;
    private LocalDate startDate;
    private LocalDate endDate ;
    private String jobSite;

    @Enumerated(EnumType.STRING)
    private OfferStatus offerStatus;

    @OneToMany(mappedBy = "offer")
    private List<OfferCandidate> offerCandidateList;




}
