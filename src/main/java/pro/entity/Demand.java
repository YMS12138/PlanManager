package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:42
 */

import org.springframework.stereotype.Repository;

/**
 * @program: PlanManager
 * @description: 需求实体类
 * @author: LeeXy
 * @create: 2019-11-04 19:42
 **/
@Repository
public class Demand {
    /**
     * 需求计划编码
     */
    Long demandPlanCode;
    /**
     * 需求计划类型
     */
    int demandPlanType;
    /**
     * 需求计划名称
     */
    String demandPlanName;
    /**
     * 备注
     */
    String demandRemarks;
    /**
     * 需求部门
     */
    String demandDepartment;
    /**
     * 需求人员
     */
    String demandPerson;
    /**
     * 需求状态
     */
    int demandState;
    /**
     * 审批状态
     */
    int approval;
    /**
     * 月度需求计划月份 年度需求计划可为空
     */
    int demandMonth;
    /**
     * 订单编码 外键
     */
    Long orderCode;

    public Demand() {
    }

    public Demand(Long demandPlanCode, Integer demandPlanType, String demandPlanName, String demandRemarks, String demandDepartment, String demandPerson, int demandState, int approval, int demandMonth, Long orderCode) {
        this.demandPlanCode = demandPlanCode;
        this.demandPlanType = demandPlanType;
        this.demandPlanName = demandPlanName;
        this.demandRemarks = demandRemarks;
        this.demandDepartment = demandDepartment;
        this.demandPerson = demandPerson;
        this.demandState = demandState;
        this.approval = approval;
        this.demandMonth = demandMonth;
        this.orderCode = orderCode;
    }

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }

    public Integer getDemandPlanType() {
        return demandPlanType;
    }

    public void setDemandPlanType(Integer demandPlanType) {
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

    public String getDemandDepartment() {
        return demandDepartment;
    }

    public void setDemandDepartment(String demandDepartment) {
        this.demandDepartment = demandDepartment;
    }

    public String getDemandPerson() {
        return demandPerson;
    }

    public void setDemandPerson(String demandPerson) {
        this.demandPerson = demandPerson;
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

    @Override
    public String toString() {
        return "Demand{" +
                "demandPlanCode=" + demandPlanCode +
                ", demandPlanType=" + demandPlanType +
                ", demandPlanName='" + demandPlanName + '\'' +
                ", demandRemarks='" + demandRemarks + '\'' +
                ", demandDepartment='" + demandDepartment + '\'' +
                ", demandPerson='" + demandPerson + '\'' +
                ", demandState=" + demandState +
                ", approval=" + approval +
                ", demandMonth=" + demandMonth +
                ", orderCode=" + orderCode +
                '}';
    }
}
