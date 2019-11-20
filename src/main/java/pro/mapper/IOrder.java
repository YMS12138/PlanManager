package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/10 19:59
 */




import org.springframework.stereotype.Repository;
import pro.entity.Orders;


import java.util.List;
@Repository
public interface IOrder {
    public void insertOrders(List<Orders> ordersList);
    public List<Orders> selectOrderByCode(Long demandPlanCode);
    public List<Orders> selectAllOrder();
    public void updateByCode(List<Orders> orders);
    public void delete(Long demandCode, Long OrderCode);
    public void findByCode(Long demandPlanCode);
    public List<Orders> findmaterialCodes();
}
