package pro.Entity;/*
 *@author LeeXy
 *@date 2019/11/4 20:25
 */

import java.util.Date;

/**
 * @program: PlanManager
 * @description: 流程信息
 * @author: LeeXy
 * @create: 2019-11-04 20:25
 **/

public class ProcedureInfo {
    String approver;//审批人
    Date approvalTime;//审批时间
    String aprovalOpinion;//审批意见
    String explain;//说明
    Long orderCode;//外键订单信息
}
