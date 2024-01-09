package com.ECommerce.major.repository;

import java.util.*;
import com.ECommerce.major.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{
    Optional<User> findUserByEmail(String email);
}
