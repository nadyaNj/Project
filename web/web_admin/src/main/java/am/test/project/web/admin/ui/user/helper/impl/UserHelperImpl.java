package am.test.project.web.admin.ui.user.helper.impl;

import am.test.project.web.admin.ui.user.helper.UserHelper;
import am.test.project.web.facade.user.UserFacade;
import am.test.project.web.facade.user.model.UserFacadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nadya
 * DATE: 5/18/16
 * TIME: 11:17 AM
 */

@Component
public class UserHelperImpl implements UserHelper {

    /*Dependencies*/
    @Autowired
    private UserFacade userFacade;

    public UserFacadeModel getLoginUser(String userName, String password) {
        return userFacade.getLoginUser(userName, password);
    }
}
