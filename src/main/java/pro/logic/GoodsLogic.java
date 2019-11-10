package pro.logic;

import javafx.fxml.FXML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.mapper.IMonth;
import pro.mapper.IOrder;

/**
 * 物资需求管理逻辑
 */
@Service
public class GoodsLogic {


    /**
     * 增，创建一个年度计划表
     */
    public void createYear(Demand demand, Orders order){
        //获取计划表信息
        //...

        //DAO
        //...
    }

    public void selectYearByCode(Long Code){

    }

    public void selectYearAll(){

    }

    public void deleteYear(Long Code){

    }

    public void updateYear(){

    }

    /**
     * 增，创建一个月度计划表
     */
    public void createMonth(Demand demand,Orders orders){

        IMonth iMonth = Application.ac.getBean("IMonth",IMonth.class);
        IOrder iOrder = Application.ac.getBean("IOrder",IOrder.class);
        //获取计划表信息
        //...
        //iMonth.insertMDemand(demand);
        //System.out.println(orders);
        iOrder.insertOrder(orders);
        System.out.println("8++++++++++");
        //mapper
        //...
    }

    public void selectMonthByCode(){

    }

    public void selectMonthAll(){

    }

    public void deleteMonth(){

    }

    public void updateMonth(){

    }
    
}
