package org.example.model.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.example.model.Role;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private String login;
    private String password;
    private Role role;
}
