package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/10 19:59
 */




import org.springframework.stereotype.Repository;
import pro.entity.Orders;


import java.util.List;
@Repository
public interface IOrder {
    public void insertOrder(Orders order);
    public void insertOrders(List<Orders> orders);
    public List<Orders> selectOrderByCode();
    public void updateByCode(List<Orders> orders);
    public void delete(Long demandCode,Long OrderCode);
}
