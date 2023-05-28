/*package com.csidigital.rh.dao.entity;

import com.csidigital.rh.shared.enumeration.ExperienceLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cat {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "catName")
    private String name;

    @Enumerated(EnumType.STRING)
    private ExperienceLevel level ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Cat parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Cat> subCategories;


}*/
