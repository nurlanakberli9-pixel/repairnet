package com.repairnet.repo;

import com.repairnet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
