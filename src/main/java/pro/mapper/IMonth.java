package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/9 15:37
 */

import org.springframework.stereotype.Service;
import pro.entity.Demand;
import pro.entity.Order;
@Service
public interface IMonth {
    public void insertMDemand(Demand demand);
    public void insertMOrder(Order order);
}
