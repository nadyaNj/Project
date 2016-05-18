package am.test.project.persistence.repository.user;

import am.test.project.service.user.model.UserModel;
import com.sun.istack.internal.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;


/**
 * Created by nadya
 * DATE: 5/6/16
 * TIME: 1:02 PM
 */

/**
 * Repository for user model
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Nullable
    UserModel findByUserNamePassword(@Nonnull final String userName, @Nonnull final String password);
}
