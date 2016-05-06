package am.test.project.service.User.dto;

/**
 * Created by nadya
 * DATE: 5/6/16
 * TIME: 1:04 PM
 */

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Dto model for User database madel
 */
public class User implements Serializable {

    private static final long serialVersionUID = -5399172957685507834L;

    /*Properties*/
    private Long id;

    private String userName;

    private String email;

    private String password;

    /* Getters and Setters */

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(getId(), user.getId())
                .append(getUserName(), user.getUserName())
                .append(getEmail(), user.getEmail())
                .append(getPassword(), user.getPassword())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .append(getUserName())
                .append(getEmail())
                .append(getPassword())
                .toHashCode();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /* */



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("userName", getUserName())
                .append("email", getEmail())
                .append("password", getPassword())
                .toString();
    }
}
