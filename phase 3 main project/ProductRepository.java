
package com.patel.SportyShoes.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patel.SportyShoes.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{


	
}