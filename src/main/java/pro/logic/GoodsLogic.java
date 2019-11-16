package pro.logic;


import org.springframework.stereotype.Service;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;

import pro.mapper.IInsertMonth;
import pro.mapper.IOrder;
import pro.mapper.UDFDeman;

import java.util.List;


/**
 * 物资需求管理逻辑
 */
@Service
public class GoodsLogic {

    /**
     * 增，创建一个计划表
     */
    public void createDemand(Demand demand, List<Orders> ordersList) {
        IInsertMonth iInsertMonth = Application.ac.getBean("IInsertMonth", IInsertMonth.class);
        IOrder iOrder = Application.ac.getBean("IOrder", IOrder.class);
        iInsertMonth.insertMDemand(demand);
        iOrder.insertOrders(ordersList);
        System.out.println("8++++++++++");
    }

    /**
     * 查询订单与计划
     *
     * @param demandPlanCode
     * @return
     */
    public Demand selectDOByCode(Long demandPlanCode) {
        UDFDeman udfDeman = Application.ac.getBean("UDFDeman", UDFDeman.class);
        Demand demand = udfDeman.selectMOByCode(demandPlanCode);
        return demand;
    }

    /**
     * 查询计划
     *
     * @param demandPlanCode
     * @return
     */
    public Demand selectDByCode(Long demandPlanCode) {
        UDFDeman udfDeman = Application.ac.getBean("UDFDeman", UDFDeman.class);
        Demand demand = udfDeman.selectByCode(demandPlanCode);
        return demand;

    }

    /**
     * 查找所有物料信息根据
     */
    public List<Orders> selectAllOrder(){
        //...
        return null;
    }


    public void deleteDemand(Long demandPlanCode) {
        UDFDeman udfDeman = Application.ac.getBean("UDFDeman", UDFDeman.class);
        udfDeman.deleteDemandByCode(demandPlanCode);
    }

    public void updateDemand(Demand demand) {
        UDFDeman udfDeman = Application.ac.getBean("UDFDeman", UDFDeman.class);
        udfDeman.updateMDemandById(demand);
    }

    public void updateState(Long demandPlanCode) {
        UDFDeman udfDeman = Application.ac.getBean("UDFDeman", UDFDeman.class);
        udfDeman.updateStateByCode(demandPlanCode);
    }

    /**
     * 查询显示审批页面
     *
     * @return
     */
    public List<Orders> findAll() {
        List<Orders> orders = null;
        IOrder iOrder = Application.ac.getBean("IOrder", IOrder.class);
        orders = iOrder.selectAllOrder();
        return orders;
    }
}
