package pro.logic;

import org.springframework.stereotype.Service;
import pro.Application;
import pro.entity.User;
import pro.mapper.IUser;

import java.util.List;

/**
 * 用户逻辑
 */
@Service
public class UserLogic {
    /**
     * 判断用户身份
     *
     * @param user
     */
    public void judge(User user) {

    }

    /**
     * 增加用户
     */
    public void insert(User user) {
    }

    ;

    /**
     * 删除用户
     */
    public void delete() {
    }

    /**
     * 更改用户 参数自己填
     */
    public void update() {
    }

    /**
     * 查询用户
     */
    public void selecttAll() {

    }

    public List<User> findAll() {
        List<User> user = null;
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        user = iUser.findAll();
        return user;

    }
}
