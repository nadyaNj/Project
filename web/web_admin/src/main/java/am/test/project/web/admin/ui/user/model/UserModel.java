package am.test.project.web.admin.ui.user.model;

import am.test.project.web.facade.user.model.UserFacadeModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by nadya
 * DATE: 5/18/16
 * TIME: 11:14 AM
 */
public class UserModel implements Serializable {
    private static final long serialVersionUID = -1687336537222909774L;

    /*Properties*/

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

    /**
     * Update user page Model to facade
     * @param userFacadeModel
     */
    public void updateUserPageProperties(final UserFacadeModel userFacadeModel) {
        userFacadeModel.setId(getId());
        userFacadeModel.setUserName(getUserName());
        userFacadeModel.setEmail(getEmail());
        userFacadeModel.setPassword(getPassword());
    }

    /*Hashcode, Equals, toString*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UserModel)) return false;

        UserModel userModel = (UserModel) o;

        return new EqualsBuilder()
                .append(getId(), userModel.getId())
                .append(getUserName(), userModel.getUserName())
                .append(getEmail(), userModel.getEmail())
                .append(getPassword(), userModel.getPassword())
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
