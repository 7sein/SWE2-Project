package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class BrandController {

    @Autowired
    private BrandRepository BR;


    @GetMapping("/addBrand")
    public Map addBrand() {
        return Collections.singletonMap("status", "NotOk");
    }

    @PostMapping("/addBrand")
    public Map addBrand1(@RequestBody Brand brand) {

        List<Brand> brands = BR.findByName(brand.getName());
        if(brands.size() == 0){
            BR.save(brand);
            return Collections.singletonMap("status", "Ok");
        }

        return Collections.singletonMap("status", "NotOk");

    }

}
