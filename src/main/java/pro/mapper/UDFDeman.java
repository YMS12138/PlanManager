package pro.mapper;/*
 *@author LeeXy
 *@date 2019/11/12 23:09
 */

import org.springframework.stereotype.Service;
import pro.entity.Demand;
@Service
public interface UDFDeman {

    /**
     * 返回计划类型并且带着订单
     * @param demandPlanCode
     * @return
     */

    public Demand selectMOByCode(Long demandPlanCode);

    /**
     * 返回计划类型 不返回订单
     * @param demandPlanCode
     * @return
     */
    public Demand selectByCode(Long demandPlanCode);

    /**
     * 更改计划
     * @param demand
     */
    public void updateMDemandById(Demand demand);

    /**
     * 删除计划
     * @param demandPlanCode
     */
    public void deleteDemandByCode(Long demandPlanCode);

    /**
     * 根据修改提交状态
     * @param demandPlanCode
     */
    public void updateStateByCode(Long demandPlanCode);

}
