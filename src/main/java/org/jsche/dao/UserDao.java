package org.jsche.dao;

import org.apache.ibatis.annotations.Param;
import org.jsche.entity.User;

/**
 * Created by myan on 2017/3/29.
 */

public interface UserDao {

    User getUserByEmail(@Param("email") String email);

    void save(User user);

    User getUserById(@Param("id") int id);

    void updateUserAvatar(User user);

    void updateLastLogin(User user);
}
