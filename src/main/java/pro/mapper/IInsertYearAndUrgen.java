package pro.mapper;

import org.springframework.stereotype.Service;
import pro.entity.Demand;
import pro.entity.Orders;

@Service
public interface IInsertYearAndUrgen {
    /**
     * 增加年度订单或者紧急订单
     * @param demand
     */
    public void insertYUDemand(Demand demand);
}
