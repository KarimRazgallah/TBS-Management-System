package com.razgallah.TBS.Management.System.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 03-Jan-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer phoneNumber;
    private String major;
    private String minor;
}
