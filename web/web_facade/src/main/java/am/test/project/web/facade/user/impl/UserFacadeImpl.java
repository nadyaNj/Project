package am.test.project.web.facade.user.impl;

import am.test.project.service.user.UserService;
import am.test.project.web.facade.user.UserFacade;
import am.test.project.web.facade.user.model.UserFacadeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nadya
 * DATE: 5/18/16
 * TIME: 11:46 AM
 */

@Service
public class UserFacadeImpl implements UserFacade {

    private static final long serialVersionUID = -3264053685759455459L;

    /*Dependencies*/
    @Autowired
    UserService userService;




    public UserFacadeModel getLoginUser(String userName, String password) {

        UserFacadeModel userFacadeModel = new UserFacadeModel();
        userFacadeModel.updateUserToFacade(userService.getUser(userName, password));

        return userFacadeModel;

    }




}
