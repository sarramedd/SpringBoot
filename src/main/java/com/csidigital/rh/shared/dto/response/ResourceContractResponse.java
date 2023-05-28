package com.csidigital.rh.shared.dto.response;

import com.csidigital.rh.shared.enumeration.ContractType;
import com.csidigital.rh.shared.enumeration.Currency;
import com.csidigital.rh.shared.enumeration.EndContractReason;
import com.csidigital.rh.shared.enumeration.SalaryType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class ResourceContractResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private ContractType contractType;
    private String trialPeriod;
    private EndContractReason endContractReason;
    private SalaryType salaryType;
    private Long changeCoefficient;
    private double contractFees;
    private String workingTime;
    private Currency currency;
    private double averageDailyCost;
    private double rateDailyCost;

}
