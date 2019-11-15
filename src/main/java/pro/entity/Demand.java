package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:42
 */

import javafx.beans.property.*;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    String demandPlanType;
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
    String demandState;
    /**
     * 审批状态
     */
    String approval;
    /**
     * 月度需求计划月份 年度需求计划可为空
     */
    Integer demandMonth;
    /**
     * 订单编码 外键
     */
    Long orderCode;


    List<Orders> ordersList;

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }

    public String getDemandPlanType() {
        return demandPlanType;
    }

    public void setDemandPlanType(String demandPlanType) {
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

    public String getDemandState() {
        return demandState;
    }

    public void setDemandState(String demandState) {
        this.demandState = demandState;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public Integer getDemandMonth() {
        return demandMonth;
    }

    public void setDemandMonth(Integer demandMonth) {
        this.demandMonth = demandMonth;
    }

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 默认构造函数
     */
    public Demand() {
    }

    /**
     * 创建一个新的副本
     */
    public Demand(Demand demand) {
        if (demand == null) {
            return;
        }
        this.demandPlanCode = demand.getDemandPlanCode();
        this.demandPlanType = demand.getDemandPlanType();
        this.demandPlanName = demand.getDemandPlanName();
        this.demandRemarks = demand.getDemandRemarks();
        this.demandDepartment = demand.getDemandDepartment();
        this.demandPerson = demand.getDemandPerson();
        this.demandState = demand.getDemandState();
        this.approval = demand.getApproval();
        this.demandMonth = demand.getDemandMonth();
        this.orderCode = demand.getOrderCode();
    }

    @Override
    public String toString() {
        return "Demand{" +
                "demandPlanCode=" + demandPlanCode +
                ", demandPlanType='" + demandPlanType + '\'' +
                ", demandPlanName='" + demandPlanName + '\'' +
                ", demandRemarks='" + demandRemarks + '\'' +
                ", demandDepartment='" + demandDepartment + '\'' +
                ", demandPerson='" + demandPerson + '\'' +
                ", demandState='" + demandState + '\'' +
                ", approval='" + approval + '\'' +
                ", demandMonth=" + demandMonth +
                ", orderCode=" + orderCode +
                ", ordersList=" + ordersList +
                '}';
    }
}
