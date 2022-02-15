
package com.patel.SportyShoes.jdbc;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.patel.SportyShoes.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
public List<UserDetails> findByusername(String username);

public List<UserDetails> findAll();
}
