package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/9 15:37
 */

import com.mysql.jdbc.UpdatableResultSet;
import org.springframework.stereotype.Service;
import pro.entity.Demand;


import java.util.List;

@Service
public interface IInsertMonth {
    /**
     * 增加月度订单
     * @param demand
     */
    public void insertMDemand(Demand demand);




}
