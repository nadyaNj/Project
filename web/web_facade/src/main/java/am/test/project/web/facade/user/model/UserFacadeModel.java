package am.test.project.web.facade.user.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by nadya
 * DATE: 5/11/16
 * TIME: 11:49 AM
 */

/**
 * facade model for user
 */
public class UserFacadeModel implements Serializable {
    private static final long serialVersionUID = 3658128029016736711L;

    /* Properties */

    private Long id;

    private String userName;

    private String email;

    private String password;

    /*Getter and Setter*/

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

    /* Hashcode, Equals and ToString */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserFacadeModel that = (UserFacadeModel) o;

        return new EqualsBuilder()
                .append(getId(), that.getId())
                .append(getUserName(), that.getUserName())
                .append(getEmail(), that.getEmail())
                .append(getPassword(), that.getPassword())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(getUserName())
                .append(getEmail())
                .append(getPassword())
                .toHashCode();
    }


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
