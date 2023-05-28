package com.csidigital.rh.management.service;

import com.csidigital.rh.shared.dto.request.CertificationRequest;
import com.csidigital.rh.shared.dto.request.ContractRequest;
import com.csidigital.rh.shared.dto.response.CertificationResponse;
import com.csidigital.rh.shared.dto.response.ContractResponse;

import java.util.List;

public interface ContractService {
    ContractResponse createContract(ContractRequest request);
    List<ContractResponse> getAllContracts();
    ContractResponse getContractById(Long id);

    ContractResponse updateContract(ContractRequest request, Long id);

    void deleteContract(Long id);
}
