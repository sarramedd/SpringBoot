package com.csidigital.rh.shared.dto.request;

import com.csidigital.rh.shared.enumeration.OfferStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class OfferRequest {
    private String title;
    private String reference;
    private String description ;
    private String requiredSkills ;
    private Long requiredExperienceAmount ;
    private OfferStatus offerStatus;
    private LocalDate startDate;
    private LocalDate endDate ;
    private String jobSite;

}
