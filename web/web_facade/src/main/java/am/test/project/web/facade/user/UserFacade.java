package am.test.project.web.facade.user;

import am.test.project.web.facade.user.model.UserFacadeModel;

import java.io.Serializable;

/**
 * Created by nadya
 * DATE: 5/11/16
 * TIME: 11:47 AM
 */

/**
 * Facade for user
 */

public interface UserFacade extends Serializable {
     UserFacadeModel getLoginUser(String userName, String password);
}
