package com.razgallah.TBS.Management.System.user.student;

import com.razgallah.TBS.Management.System.user.Person;
import com.razgallah.TBS.Management.System.user.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 04-Jan-23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends Person implements UserDetails {

    private String major;
    private String minor;

    @Builder
    public Student(Integer personID, String firstName, String lastName, String email, String password, Integer phoneNumber, Role role, String major, String minor) {
        super(personID, firstName, lastName, email, password, phoneNumber, role);
        this.major = major;
        this.minor = minor;
    }
}
