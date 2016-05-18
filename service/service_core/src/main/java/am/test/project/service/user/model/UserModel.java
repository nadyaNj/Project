package am.test.project.service.user.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nadya
 * DATE: 5/6/16
 * TIME: 1:04 PM
 */

/**
 * Database model for user
 */

@Entity
@Table(name="user")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 4162227130285004914L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "permission")
    private String permission;


    /*Getters and setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
