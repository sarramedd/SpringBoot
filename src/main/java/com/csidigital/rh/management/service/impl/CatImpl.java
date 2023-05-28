/*package com.csidigital.rh.management.service.impl;

import com.csidigital.rh.dao.entity.*;
import com.csidigital.rh.dao.repository.CatRepository;
import com.csidigital.rh.management.service.CatService;
import com.csidigital.rh.shared.dto.request.CatRequest;
import com.csidigital.rh.shared.dto.request.TechnicalFileRequest;
import com.csidigital.rh.shared.dto.response.*;
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


public class CatImpl implements CatService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CatRepository catRepository;

   /* @Override
    public CatResponse createCat(CatRequest request) {
        Cat parent =  catRepository.findById(request.getParentNum()).orElseThrow();
        Cat cat= modelMapper.map(request, Cat.class);
        cat.setParent(parent);
        Cat catSaved = catRepository.save(cat);
        return modelMapper.map(catSaved, CatResponse .class);
    }*/
   /*@Override
   public CatResponse createCat(CatRequest request) {
       Cat cat = modelMapper.map(request, Cat.class);

       if (request.getParentNum() != null) {
           Cat parent = catRepository.findById(request.getParentNum())
                   .orElseThrow(() -> new ResourceNotFoundException("Parent Cat with id " + request.getParentNum() + " not found"));
           cat.setParent(parent);
       } else {
           cat.setParent(null); // or set it to a predefined value indicating the root category
       }

       Cat catSaved = catRepository.save(cat);
       return modelMapper.map(catSaved, CatResponse.class);
   }



    @Override
    public List<CatResponse> getAllCats() {
        List<Cat> cats = catRepository.findAll();
        List<CatResponse> catResponseList = new ArrayList<>();

        for (Cat cat : cats) {
            CatResponse response = modelMapper.map(cat, CatResponse.class);
            catResponseList.add(response);  }

        return catResponseList;
    }


    @Override
    public CatResponse getCatById(Long id) {
        Cat cat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("cat with id " + id + " not found"));
        CatResponse  catResponse = modelMapper.map(cat, CatResponse.class);
        return catResponse;
    }


    @Override
    public List<CatResponse> getSubCategories(Long id) {
        Cat parentCat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cat with id " + id + " not found"));

        List<Cat> subcategories = parentCat.getSubCategories();
        List<CatResponse> subcategoryResponses = new ArrayList<>();

        for (Cat subcategory : subcategories) {
            CatResponse response = modelMapper.map(subcategory, CatResponse.class);
            subcategoryResponses.add(response);
        }
        return subcategoryResponses;
    }


    @Override
    public CatResponse updateCat(CatRequest request, Long id) {
        Cat existingCat = catRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category with id: " + id + " not found"));
        modelMapper.map(request, existingCat);
        Cat savedCat = catRepository.save(existingCat);
        return modelMapper.map(savedCat, CatResponse.class);    }

    @Override
    public void deleteCat(Long id) {catRepository.deleteById(id); }

}
*/