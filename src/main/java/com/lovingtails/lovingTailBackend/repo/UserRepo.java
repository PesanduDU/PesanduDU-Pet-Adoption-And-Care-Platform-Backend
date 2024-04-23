package com.lovingtails.lovingTailBackend.repo;

import com.lovingtails.lovingTailBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository <User, String> {

    @Query(value = "SELECT * FROM User WHERE id = ?1",nativeQuery = true)
    User getUserByID(String id);
}
