package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/9 15:37
 */

import com.mysql.jdbc.UpdatableResultSet;
import org.springframework.stereotype.Service;
import pro.entity.Demand;


import java.util.List;

@Service
public interface IMonth {
    public void insertMDemand(Demand demand);

    public Demand selectMByCode(Long code);

    public void updateDemand(Demand demand);

}
