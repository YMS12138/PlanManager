import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.entity.Account;
import pro.entity.Demand;
import pro.entity.User;
import pro.mapper.IAccountService;
import pro.mapper.IMonth;
import pro.mapper.IOrder;
import pro.mapper.IUser;

import java.util.List;

/**
 * @program: PlanManager
 * @description: 后端测试类
 * @author: LeeXy
 * @create: 2019-11-04 20:45
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//要注意一定要写配置路径
@ContextConfiguration("classpath:bean.xml")
public class test01 {
    @Autowired
    IUser iUser;
    @Autowired
    IOrder iOrder;
    @Autowired
    IMonth iMonth;
    @Test
    public void test01() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        List<User> users = iUser.findAll();
        for (User ac : users) {
            System.out.println(ac);
        }
    }
    @Test
    public void test03() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        Demand demands = iMonth.selectMByCode(1111l);
        System.out.println(demands);
    }
}

