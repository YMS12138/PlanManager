package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/8 16:10
 */

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import pro.entity.User;

import java.util.List;
@Service
public interface IUser {
    public List<User> findAll();
    @Select("select id id,user_name userName,user_pwd userPwd,user_job userJob,department department  from user where user_name=#{arg0} and user_pwd = #{arg1}")
    public User findUser(String userName,String userPwd);   // 查找用户
}
