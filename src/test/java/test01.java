import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.entity.User;
import pro.mapper.*;

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
    IInsertMonth iInsertMonth;
    @Autowired
    IInsertYearAndUrgen iInsertYearAndUrgen;
    @Autowired
    UDFDeman udfDeman;


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
    public void test02() {
        Demand demand = new Demand();
        demand.setDemandPlanCode(1112311L);
        iInsertYearAndUrgen.insertYUDemand(demand);
        System.out.println("添加成功");
    }

    @Test
    public void test03() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        Demand demands = udfDeman.selectByCode(1112311L);
        System.out.println(demands);

    }

    @Test
    public void test04() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        udfDeman.deleteDemandByCode(1223L);
        System.out.println("删除成功");
    }

    @Test
    public void test05() {
//    ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService =  context.getBean("accountService",IAccountService.class);
        Demand demand = new Demand();
        demand.setDemandPlanCode(1111L);
        demand.setDemandMonth(10);
        udfDeman.updateMDemandById(demand);
        System.out.println("成功");
    }

    @Test
    public void test06() {
//        List<Demand> demands = approval.findAll();
//        demands.forEach(demand -> {
//            System.out.println(demand.toString());
//        });
    }

    @Test
    public void test07() {
        List<Orders> ordersList = iOrder.selectAllOrder();
        for (Orders o : ordersList) {
            System.out.println(o);
        }
    }
}

