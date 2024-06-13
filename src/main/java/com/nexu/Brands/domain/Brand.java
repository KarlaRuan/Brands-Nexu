package com.nexu.Brands.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Brand implements Serializable{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
   
   @NotEmpty
   private String nombre;
   
   @NotEmpty
   private int averagePrice;
   
}
