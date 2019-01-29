package com.xzha0006.demo.repository;

import com.xzha0006.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author James
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
