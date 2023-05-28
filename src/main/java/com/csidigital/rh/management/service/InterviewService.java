package com.csidigital.rh.management.service;
import com.csidigital.rh.shared.dto.request.InterviewRequest;
import com.csidigital.rh.shared.dto.response.InterviewResponse;
import com.csidigital.rh.shared.dto.response.QuestionTypeResponse;

import java.util.List;

public interface InterviewService {
    InterviewResponse createInterview(InterviewRequest request);
    List<InterviewResponse> getAllInterview();
    InterviewResponse getInterviewById(Long id);
    List<QuestionTypeResponse> getQuestionTypesbyInterview(Long id) ;

    InterviewResponse updateInterview(InterviewRequest request, Long id);

    void deleteInterview(Long id);

    void  updateStatusToPlannedById (Long id);
    void updateStatusToEndedById (Long id);

    void updateStatusToCancelledById (Long id);

}
