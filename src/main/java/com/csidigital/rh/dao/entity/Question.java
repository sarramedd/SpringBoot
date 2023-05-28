package com.csidigital.rh.dao.entity;

import com.csidigital.rh.shared.enumeration.InterviewType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private String question;
    @Enumerated(EnumType.STRING)

    @JsonIgnore
    @OneToMany(mappedBy = "question")
    private List<AssQuestionInterview> assQuestionInterviewList ;


    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "categoryId")
    private QuestionCategory questionCategory;
}




