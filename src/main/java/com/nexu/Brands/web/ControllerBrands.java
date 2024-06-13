package com.nexu.Brands.web;

import com.nexu.Brands.domain.Brand;
import com.nexu.Brands.service.BrandService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerBrands {
    
    @Autowired
    private BrandService brandService;
    
    @GetMapping("/brands")
    public String getBrands(Model model){
        var brands = brandService.getBrands();
        model.addAttribute("personas", brands);
        return "index";
    }
    
    @GetMapping("/create")
    public String create(Brand brand){
        return "create";
    }
    
    @PostMapping("/save")
    public String save(@Valid Brand brand, Errors errores){
        
        if(errores.hasErrors()){
            return "update";
        } 
        brandService.saveBrand(brand);
        return "redirect:/";
    }
    
    @GetMapping("/update/{idBrand}")
    public String update(Brand brand, Model model){
        brand = brandService.getBrandById(brand);
        model.addAttribute("brand", brand);
        return "update";
    }
    
    @GetMapping("/delete")
    public String daelete(Brand brand){
        brandService.deleteBrand(brand);
        return "redirect:/";
    }
    
}
