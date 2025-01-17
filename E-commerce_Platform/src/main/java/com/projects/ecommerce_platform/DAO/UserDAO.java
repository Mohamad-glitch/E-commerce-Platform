package com.projects.ecommerce_platform.DAO;

import com.projects.ecommerce_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {


}
