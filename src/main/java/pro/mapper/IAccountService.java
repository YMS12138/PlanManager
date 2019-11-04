package pro.mapper;/*
 *@author LeeXy
 *@date 2019/10/20 22:47
 */


import org.springframework.stereotype.Service;
import pro.Entity.Account;

import java.util.List;

/**
 * @program: springTest
 * @description:
 * @author: LeeXy
 * @create: 2019-10-20 22:47
 **/
@Service("accountService")
public interface IAccountService {
    public  void saveAccount();
    public Account findById();
    public List<Account> findAll();
}
