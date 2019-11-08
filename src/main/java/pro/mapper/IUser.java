package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/8 16:10
 */

import org.springframework.stereotype.Service;
import pro.entity.User;

import java.util.List;
@Service
public interface IUser {
    public List<User> findAll();
}
