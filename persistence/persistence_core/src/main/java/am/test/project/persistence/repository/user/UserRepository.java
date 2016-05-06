package am.test.project.persistence.repository.user;

import am.test.project.service.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nadya
 * DATE: 5/6/16
 * TIME: 1:02 PM
 */

/**
 * Repository for User model
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
