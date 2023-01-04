package com.razgallah.TBS.Management.System.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 04-Jan-23
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<User> findByEmail(String email);
}