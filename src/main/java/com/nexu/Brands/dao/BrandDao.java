package com.nexu.Brands.dao;

import com.nexu.Brands.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand, Long>{
    
}
