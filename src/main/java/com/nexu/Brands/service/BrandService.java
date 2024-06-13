package com.nexu.Brands.service;

import com.nexu.Brands.domain.Brand;
import java.util.List;

public interface BrandService {
    
    public List<Brand> getBrands();
    
    public void saveBrand(Brand brand);
    
    public void deleteBrand(Brand brand);
    
    public Brand getBrandById(Brand brand);
   
}
