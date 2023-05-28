package com.csidigital.rh.management.service.impl;

import com.csidigital.rh.dao.entity.*;
import com.csidigital.rh.dao.repository.AdministrativeDataRepository;
import com.csidigital.rh.dao.repository.AssOfferCandidateRepository;
import com.csidigital.rh.dao.repository.EmployeeRepository;
import com.csidigital.rh.dao.repository.EvaluationRepository;
import com.csidigital.rh.management.service.EvaluationService;
import com.csidigital.rh.shared.dto.request.EvaluationRequest;
import com.csidigital.rh.shared.dto.response.CertificationResponse;
import com.csidigital.rh.shared.dto.response.EmployeeResponse;
import com.csidigital.rh.shared.dto.response.EvaluationResponse;
import com.csidigital.rh.shared.dto.response.InterviewResponse;
import com.csidigital.rh.shared.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class EvaluationImpl implements EvaluationService {
   @Autowired 
   private EvaluationRepository evaluationRepository ; 
   @Autowired 
   private ModelMapper modelMapper ;
   @Autowired
   private AssOfferCandidateRepository offerCandidateRepository;

    @Autowired
    private AdministrativeDataRepository administrativeDataRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EvaluationResponse createEvaluation(EvaluationRequest request) {
        Employee employee =  employeeRepository.findById(request.getEmployeeNum()).orElseThrow();
        Evaluation evaluation = modelMapper.map(request, Evaluation.class);
        evaluation.setEmployee(employee);
        Evaluation evaluationSaved = evaluationRepository.save(evaluation);
        return modelMapper.map(evaluationSaved, EvaluationResponse.class);
    }

    @Override
    public List<EvaluationResponse> getAllEvaluations() {
        List<Evaluation> evaluations = evaluationRepository.findAll();
        List<EvaluationResponse> evaluationList = new ArrayList<>();

        for (Evaluation evaluation : evaluations) {
            EvaluationResponse response = modelMapper.map(evaluation, EvaluationResponse.class);
            evaluationList.add(response);
        }

        return evaluationList;
    }

    @Override
    public EvaluationResponse getEvaluationById(Long id) {
        Evaluation evaluation = evaluationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Evaluation with id " +id+ " not found"));
        EvaluationResponse evaluationResponse = modelMapper.map(evaluation, EvaluationResponse.class);
        return evaluationResponse;
    }

    @Override
    public EmployeeResponse getEmployeeByEvaluationId(Long id) {
        Evaluation evaluation = evaluationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Evaluation with id " + id + " not found"));
        Employee employee = evaluation.getEmployee();
        EmployeeResponse employeeResponse=modelMapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }


    @Override
    public List<InterviewResponse> getEvaluationInterviews(Long id) {
        Evaluation evaluation = evaluationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Evaluation with id " +id+ " not found"));
        List<Interview> interviews = evaluation.getInterviews();
        List<InterviewResponse> interviewResponseList = new ArrayList<>();

        for (Interview interview : interviews) {
            InterviewResponse response = modelMapper.map(interview, InterviewResponse.class);
            interviewResponseList.add(response);
        }
        return interviewResponseList ;
    }


    @Override
    public EvaluationResponse updateEvaluation(EvaluationRequest request, Long id) {
        Evaluation existingEvaluation = evaluationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Evaluation with id: " + id + " not found"));
        modelMapper.map(request, existingEvaluation);
        Evaluation savedEvaluation = evaluationRepository.save(existingEvaluation);
        return modelMapper.map(savedEvaluation, EvaluationResponse.class);
    }

    @Override
    public void deleteEvaluation(Long id) {
        evaluationRepository.deleteById(id);
    }

}
