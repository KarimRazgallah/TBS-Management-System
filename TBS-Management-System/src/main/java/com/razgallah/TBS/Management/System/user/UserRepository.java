package com.razgallah.TBS.Management.System.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 03-Jan-23
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
