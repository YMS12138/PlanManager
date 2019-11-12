package pro.logic;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.mapper.IInsertMonth;
import pro.mapper.IOrder;
import pro.mapper.IInsertYearAndUrgen;

/**
 * 物资需求管理逻辑
 */
@Service
public class GoodsLogic {


    /**
     * 增，创建一个年度计划表
     */
    public void createYear(Demand demand, Orders order){

    }
    public void deleteYear(Long Code){


    }

    public void updateYear(Long Code){

    }
    /**
     * 增，创建一个月度计划表
     */
    public void createMonth(Demand demand,Orders orders){

        IInsertMonth iInsertMonth = Application.ac.getBean("IInsertMonth", IInsertMonth.class);
        IOrder iOrder = Application.ac.getBean("IOrder",IOrder.class);
        //获取计划表信息
        //...
        iInsertMonth.insertMDemand(demand);
        //System.out.println(orders);
        iOrder.insertOrder(orders);
        System.out.println("8++++++++++");
        //mapper
        //...
    }

    /**
     * 获取月度计划的订单
     * @param demandPlanCode
     */
    public void selectMonthByCode(Long demandPlanCode){


    }

    public void selectMonthAll(){

    }

    public void deleteMonth(){

    }

    public void updateMonth(){

    }
    
}
