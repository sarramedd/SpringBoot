package com.csidigital.rh.management.service;

import com.csidigital.rh.shared.dto.request.QuestionTypeRequest;
import com.csidigital.rh.shared.dto.response.QuestionCategoryResponse;
import com.csidigital.rh.shared.dto.response.QuestionResponse;
import com.csidigital.rh.shared.dto.response.QuestionTypeResponse;
import com.csidigital.rh.shared.dto.response.TechnicalFileResponse;

import java.util.List;

public interface QuestionTypeService {
    QuestionTypeResponse createQuestionType(QuestionTypeRequest request);
    List<QuestionTypeResponse> getAllQuestionTypes();
    QuestionTypeResponse getQuestionTypeById(Long id);
    List<QuestionCategoryResponse> getQuestionCategoryByType(Long id);
    List<QuestionResponse> getQuestionsByCategoryAndType(Long id ,Long Id);


    QuestionTypeResponse updateQuestionType(QuestionTypeRequest request, Long id);

    void deleteQuestionType(Long id);
}
