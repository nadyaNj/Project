package am.test.project.service.user.impl;

import am.test.project.persistence.repository.user.UserRepository;
import am.test.project.service.user.UserService;
import am.test.project.service.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nadya
 * DATE: 5/18/16
 * TIME: 11:33 AM
 */

@Service
public class UserServiceImpl implements UserService {

    /*Dependencies*/
    @Autowired
    private UserRepository userRepository;


    public UserDto getUser(String userName, String password) {
        UserDto userDto = new UserDto();
        userDto.updateModelToDto(userRepository.findByUserNamePassword(userName, password));
        return userDto;
    }
}
