package com.nexu.Brands.serviceImplements;

import com.nexu.Brands.dao.BrandDao;
import com.nexu.Brands.domain.Brand;
import com.nexu.Brands.service.BrandService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BrandServiceImpl implements BrandService{
    
    @Autowired
    private BrandDao brandDao;

    @Override
    @Transactional(readOnly=true)
    public List<Brand> getBrands() {
        return (List<Brand>) brandDao.findAll();
    }

    @Override
    @Transactional
    public void saveBrand(Brand brand) {
        brandDao.save(brand);
    }

    @Override
    public void deleteBrand(Brand brand) {
        brandDao.delete(brand);
    }

    @Override
    @Transactional(readOnly=true)
    public Brand getBrandById(Brand brand) {
        return brandDao.findById(brand.getId()).orElse(null);
    }
    
    
    
}
