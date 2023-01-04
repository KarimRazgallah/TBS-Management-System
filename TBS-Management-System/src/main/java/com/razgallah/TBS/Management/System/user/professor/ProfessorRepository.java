package com.razgallah.TBS.Management.System.user.professor;

import com.razgallah.TBS.Management.System.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 04-Jan-23
 */
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    Optional<User> findByEmail(String email);

}
