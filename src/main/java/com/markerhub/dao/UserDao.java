package com.markerhub.dao;


import com.markerhub.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *   一般 Repository  是对Dao 声明
 *       Service    是对业务层 声明
 *       Controller  对Controller  声明
 *       RestController=  Controller+ RequestBody
 *       Resource类似 Autowired   但要指定名字 声明
 */
@Repository
public interface UserDao {
    /**
     *  进行 增删改查
     * @param user
     * @return
     */
    public int addUser(User user);
    public User getUserById(int id);
    public int editUser(User user);
    public int deleteUser(int id);
    public List<User> getAllUser(@Param("username") String username
            , @Param("pageStart") int pageStart
            , @Param("pageSize") int pageSize);

}
