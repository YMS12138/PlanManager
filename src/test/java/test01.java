import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.entity.Demand;
import pro.entity.User;
import pro.mapper.Approval;
import pro.mapper.FindAndFix;
import pro.mapper.IUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    Approval a;
    @Autowired
    FindAndFix f;

    @Test
    public void test01() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        Map<String, Object> map = new HashMap();
        map.put("demandplantype", 45);
        List<Demand> d = a.findAll();
        //List<Demand> d = f.findBy(map);
        User u = new User();
        u = iUser.findUser("aa", "sadsad");
        System.out.println(u);
        for (Demand ac : d) {
            System.out.println(ac);
        }
    }
}


