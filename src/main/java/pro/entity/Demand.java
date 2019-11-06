package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:42
 */

/**
 * @program: PlanManager
 * @description: 需求实体类
 * @author: LeeXy
 * @create: 2019-11-04 19:42
 **/

public class Demand {
    Long demandPlanCode;//需求计划编码
    int demandPlanType;//需求计划类型
    String demandPlanName;//需求计划名称
    String demandRemarks;//备注
    int demanddepartment;//需求部门
    String demandPersonne;//需求人员
    int demandState;//需求状态
    int approval;//审批状态
    int demandMonth;//月度需求计划月份 年度需求计划可为空
    Long orderCode;//订单编码 外键

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }

    public int getDemandPlanType() {
        return demandPlanType;
    }

    public void setDemandPlanType(int demandPlanType) {
        this.demandPlanType = demandPlanType;
    }

    public String getDemandPlanName() {
        return demandPlanName;
    }

    public void setDemandPlanName(String demandPlanName) {
        this.demandPlanName = demandPlanName;
    }

    public String getDemandRemarks() {
        return demandRemarks;
    }

    public void setDemandRemarks(String demandRemarks) {
        this.demandRemarks = demandRemarks;
    }

    public int getDemanddepartment() {
        return demanddepartment;
    }

    public void setDemanddepartment(int demanddepartment) {
        this.demanddepartment = demanddepartment;
    }

    public String getDemandPersonne() {
        return demandPersonne;
    }

    public void setDemandPersonne(String demandPersonne) {
        this.demandPersonne = demandPersonne;
    }

    public int getDemandState() {
        return demandState;
    }

    public void setDemandState(int demandState) {
        this.demandState = demandState;
    }

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
    }

    public int getDemandMonth() {
        return demandMonth;
    }

    public void setDemandMonth(int demandMonth) {
        this.demandMonth = demandMonth;
    }

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 月度需求构造函数
     * @param demandPlanCode
     * @param demandPlanType
     * @param demandPlanName
     * @param demandRemarks
     * @param demanddepartment
     * @param demandPersonne
     * @param demandState
     * @param approval
     * @param demandMonth
     * @param orderCode
     */
    public Demand(Long demandPlanCode, int demandPlanType, String demandPlanName, String demandRemarks, int demanddepartment, String demandPersonne, int demandState, int approval, int demandMonth, Long orderCode) {
        this.demandPlanCode = demandPlanCode;
        this.demandPlanType = demandPlanType;
        this.demandPlanName = demandPlanName;
        this.demandRemarks = demandRemarks;
        this.demanddepartment = demanddepartment;
        this.demandPersonne = demandPersonne;
        this.demandState = demandState;
        this.approval = approval;
        this.demandMonth = demandMonth;
        this.orderCode = orderCode;
    }

    /**
     * 年度需求构造函数
     * @param demandPlanCode
     * @param demandPlanType
     * @param demandPlanName
     * @param demandRemarks
     * @param demanddepartment
     * @param demandPersonne
     * @param demandState
     * @param approval
     * @param orderCode
     */
    public Demand(Long demandPlanCode, int demandPlanType, String demandPlanName, String demandRemarks, int demanddepartment, String demandPersonne, int demandState, int approval, Long orderCode) {
        this.demandPlanCode = demandPlanCode;
        this.demandPlanType = demandPlanType;
        this.demandPlanName = demandPlanName;
        this.demandRemarks = demandRemarks;
        this.demanddepartment = demanddepartment;
        this.demandPersonne = demandPersonne;
        this.demandState = demandState;
        this.approval = approval;
        this.orderCode = orderCode;
    }

    /**
     * 默认构造函数
     */
    public Demand() {
    }

    @Override
    public String toString() {
        return "Demand{" +
                "demandPlanCode=" + demandPlanCode +
                ", demandPlanType=" + demandPlanType +
                ", demandPlanName='" + demandPlanName + '\'' +
                ", demandRemarks='" + demandRemarks + '\'' +
                ", demanddepartment=" + demanddepartment +
                ", demandPersonne='" + demandPersonne + '\'' +
                ", demandState=" + demandState +
                ", approval=" + approval +
                ", demandMonth=" + demandMonth +
                ", orderCode=" + orderCode +
                '}';
    }
}
