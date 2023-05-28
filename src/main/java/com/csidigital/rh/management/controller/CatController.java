/*package com.csidigital.rh.management.controller;
import com.csidigital.rh.management.service.impl.CatImpl;
import com.csidigital.rh.shared.dto.request.CatRequest;
import com.csidigital.rh.shared.dto.response.CatResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rh/cat")
public class CatController {
    @Autowired
    private CatImpl cat;

    @Autowired
    public CatController(CatImpl catService) {
        this.cat = catService;
    }

    @GetMapping("/getAll")
    public List<CatResponse> getAllCats(){
        return cat.getAllCats();
    }


    @GetMapping("/getCat/{id}")
    public CatResponse getCatById(@PathVariable Long id){
        return cat.getCatById(id); }



    @PostMapping("/addCat")
    public CatResponse createCat(@Valid @RequestBody CatRequest catRequest){
        return cat.createCat(catRequest);
    }


    @PutMapping("/updateCat/{id}")
    public CatResponse updateCat(@Valid @RequestBody CatRequest catRequest,
                                              @PathVariable Long id){
        return cat.updateCat(catRequest, id);
    }

    @DeleteMapping("/deleteCat/{id}")
    public void deleteCat(@PathVariable Long id){
        cat.deleteCat(id);
    }

    @GetMapping("/getSubCategories/{id}")
    public List<CatResponse> getSubCategories(@PathVariable Long id) {
        return cat.getSubCategories(id);
    }

}*/