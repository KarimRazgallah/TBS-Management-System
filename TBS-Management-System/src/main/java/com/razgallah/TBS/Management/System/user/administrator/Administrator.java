package com.razgallah.TBS.Management.System.user.administrator;

import com.razgallah.TBS.Management.System.user.Person;
import com.razgallah.TBS.Management.System.user.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "Administrators")
public class Administrator extends Person implements UserDetails {

    private String task;

    @Builder

    public Administrator(Integer personID, String firstName, String lastName, String email, String password, Integer phoneNumber, Role role, String task) {
        super(personID, firstName, lastName, email, password, phoneNumber, role);
        this.task = task;
    }
}
