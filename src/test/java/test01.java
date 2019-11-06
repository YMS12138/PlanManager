import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.entity.Account;
import pro.mapper.IAccountService;

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
    IAccountService accountService;
    @Test
    public void test01() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        List<Account> accounts = accountService.findAll();
        for (Account ac : accounts) {
            System.out.println(ac);
        }
    }
}

