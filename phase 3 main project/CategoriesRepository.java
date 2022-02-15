
package com.patel.SportyShoes.jdbc;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patel.SportyShoes.entity.Categories;
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

	 
}	