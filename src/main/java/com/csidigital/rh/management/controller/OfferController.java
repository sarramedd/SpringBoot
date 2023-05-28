package com.csidigital.rh.management.controller;
import com.csidigital.rh.management.service.impl.OfferImpl;
import com.csidigital.rh.shared.dto.request.OfferRequest;
import com.csidigital.rh.shared.dto.response.OfferResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rh/Offer")
public class OfferController {

    @Autowired
    private OfferImpl offerImpl ;

    @GetMapping("/getAll")
    public List<OfferResponse> getAllOffer() {
        return offerImpl.getAllOffer();
    }

    @GetMapping("/get/{id}")
    public OfferResponse getOfferById(@PathVariable Long id){
        return offerImpl.getOfferById(id);
    }

    @PostMapping("/add")
    public OfferResponse createOffer(@Valid @RequestBody OfferRequest offerRequest){
        return offerImpl.createOffer(offerRequest);
    }

    @PutMapping("/update/{id}")
    public OfferResponse updateOffer(@Valid @RequestBody OfferRequest offerRequest,
                                                   @PathVariable Long id){
        return offerImpl.updateOffer(offerRequest, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOffer(@PathVariable Long id){
        offerImpl.deleteOffer(id);
    }

    @PutMapping("/updateStatusToOpenById/{id}")
    void updateStatusToOpenById(@PathVariable Long id) {
        offerImpl.updateStatusToOpenById(id);
    }

    @PutMapping("/updateStatusToEndedById/{id}")
    void updateStatusToEndedById(@PathVariable Long id) {
        offerImpl.updateStatusToEndedById(id);
    }
}
