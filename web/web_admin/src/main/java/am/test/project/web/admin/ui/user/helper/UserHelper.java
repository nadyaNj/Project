package am.test.project.web.admin.ui.user.helper;

import am.test.project.web.facade.user.model.UserFacadeModel;

import java.io.Serializable;

/**
 * Created by nadya
 * DATE: 5/18/16
 * TIME: 11:14 AM
 */

/**
 * User helper class fro User data
 *
 */
public interface UserHelper extends Serializable{
   UserFacadeModel getLoginUser(String userName, String password);
}
