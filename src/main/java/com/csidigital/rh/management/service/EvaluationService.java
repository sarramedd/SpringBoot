package com.csidigital.rh.management.service;

import com.csidigital.rh.dao.entity.Employee;
import com.csidigital.rh.shared.dto.request.EvaluationRequest;
import com.csidigital.rh.shared.dto.response.*;

import java.util.List;

public interface EvaluationService {
    EvaluationResponse createEvaluation(EvaluationRequest request);
    List<EvaluationResponse> getAllEvaluations();
    EvaluationResponse getEvaluationById(Long id);
    EmployeeResponse getEmployeeByEvaluationId(Long id);


    List<InterviewResponse> getEvaluationInterviews(Long id);


    EvaluationResponse updateEvaluation(EvaluationRequest request, Long id);

    void deleteEvaluation(Long id);
}
