package pro.logic;

import javafx.scene.control.Alert;
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
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        iUser.insertU(user);
    }

    ;

    /**
     * 删除用户
     */
    public void delete(Long id) {
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        iUser.deleteU(id);
    }

    /**
     * 更改用户 参数自己填
     */
    public void update(User user, Long id) {
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        iUser.updateU(user, id);
    }

    /**
     * 查询用户
     */
    public void selecttAll() {

    }


    /**
     * 判断用户是否存在，是则跳转，否则提示不存在
     *
     * @param name
     * @param pwd
     */
    public void UserLogin(String name, String pwd) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        //用户登录
        Application.user = iUser.findUser(name, pwd);
        if (Application.user != null) {
            //判断员工职位
            if (Application.user.getUserJob() == 1) {
                System.out.println("普通员工");
                //跳转普通员工页面 return
            } else {
                System.out.println("管理员");
                //跳转管理员页面 return
            }
        } else {
            alert.setContentText("用户名或密码错误");
            alert.showAndWait();
            System.out.println("用户不存在");
            //跳转登录页页面 return
        }
    }

    /**
     * 显示所有用户
     *
     * @return
     */
    public List<User> findAll() {
        List<User> user = null;
        IUser iUser = Application.ac.getBean("IUser", IUser.class);
        user = iUser.findAll();
        return user;

    }
}
