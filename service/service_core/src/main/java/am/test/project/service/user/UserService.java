package am.test.project.service.user;

import am.test.project.service.user.dto.UserDto;

/**
 * Created by nadya
 * DATE: 5/6/16
 * TIME: 1:03 PM
 */
public interface  UserService {

    UserDto getUser(String userName, String password);
}
