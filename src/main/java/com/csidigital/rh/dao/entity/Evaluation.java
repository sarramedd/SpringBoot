package com.csidigital.rh.dao.entity;

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

public class Evaluation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "globalAppreciation")
    private int globalAppreciation;

    @ManyToOne()
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @OneToMany(mappedBy = "evaluation" , cascade = CascadeType.ALL)
    private List<Interview> interviews;

}


