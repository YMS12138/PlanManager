package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:42
 */

import javafx.beans.property.*;
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
    LongProperty demandPlanCode;
    /**
     * 需求计划类型
     */
    IntegerProperty demandPlanType;
    /**
     * 需求计划名称
     */
    StringProperty demandPlanName;
    /**
     * 备注
     */
    StringProperty demandRemarks;
    /**
     * 需求部门
     */
    StringProperty demandDepartment;
    /**
     * 需求人员
     */
    StringProperty demandPerson;
    /**
     * 需求状态
     */
    IntegerProperty demandState;
    /**
     * 审批状态
     */
    IntegerProperty approval;
    /**
     * 月度需求计划月份 年度需求计划可为空
     */
    IntegerProperty demandMonth;
    /**
     * 订单编码 外键
     */
    LongProperty orderCode;

    public long getDemandPlanCode() {
        return demandPlanCode.get();
    }

    public LongProperty demandPlanCodeProperty() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(long demandPlanCode) {
        this.demandPlanCode.set(demandPlanCode);
    }

    public int getDemandPlanType() {
        return demandPlanType.get();
    }

    public IntegerProperty demandPlanTypeProperty() {
        return demandPlanType;
    }

    public void setDemandPlanType(int demandPlanType) {
        this.demandPlanType.set(demandPlanType);
    }

    public String getDemandPlanName() {
        return demandPlanName.get();
    }

    public StringProperty demandPlanNameProperty() {
        return demandPlanName;
    }

    public void setDemandPlanName(String demandPlanName) {
        this.demandPlanName.set(demandPlanName);
    }

    public String getDemandRemarks() {
        return demandRemarks.get();
    }

    public StringProperty demandRemarksProperty() {
        return demandRemarks;
    }

    public void setDemandRemarks(String demandRemarks) {
        this.demandRemarks.set(demandRemarks);
    }

    public String getDemandDepartment() {
        return demandDepartment.get();
    }

    public StringProperty demandDepartmentProperty() {
        return demandDepartment;
    }

    public void setDemandDepartment(String demandDepartment) {
        this.demandDepartment.set(demandDepartment);
    }

    public String getDemandPerson() {
        return demandPerson.get();
    }

    public StringProperty demandPersonProperty() {
        return demandPerson;
    }

    public void setDemandPerson(String demandPerson) {
        this.demandPerson.set(demandPerson);
    }

    public int getDemandState() {
        return demandState.get();
    }

    public IntegerProperty demandStateProperty() {
        return demandState;
    }

    public void setDemandState(int demandState) {
        this.demandState.set(demandState);
    }

    public int getApproval() {
        return approval.get();
    }

    public IntegerProperty approvalProperty() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval.set(approval);
    }

    public int getDemandMonth() {
        return demandMonth.get();
    }

    public IntegerProperty demandMonthProperty() {
        return demandMonth;
    }

    public void setDemandMonth(int demandMonth) {
        this.demandMonth.set(demandMonth);
    }

    public long getOrderCode() {
        return orderCode.get();
    }

    public LongProperty orderCodeProperty() {
        return orderCode;
    }

    public void setOrderCode(long orderCode) {
        this.orderCode.set(orderCode);
    }

    /**
     * 默认构造函数
     */
    public Demand() {
        this.demandPlanCode = new SimpleLongProperty();
        this.demandPlanType = new SimpleIntegerProperty();
        this.demandPlanName = new SimpleStringProperty();
        this.demandRemarks = new SimpleStringProperty();
        this.demandDepartment = new SimpleStringProperty();
        this.demandPerson = new SimpleStringProperty();
        this.demandState = new SimpleIntegerProperty();
        this.approval = new SimpleIntegerProperty();
        this.demandMonth = new SimpleIntegerProperty();
        this.orderCode = new SimpleLongProperty();
    }

    /**
     * 创建一个新的副本
     */
    public Demand(Demand demand) {
        if (demand == null) {
            return;
        }
        this.demandPlanCode.setValue(demand.getDemandPlanCode());
        this.demandPlanType.setValue(demand.getDemandPlanType());
        this.demandPlanName.setValue(demand.getDemandPlanName());
        this.demandRemarks.setValue(demand.getDemandRemarks());
        this.demandDepartment.setValue(demand.getDemandDepartment());
        this.demandPerson.setValue(demand.getDemandPerson());
        this.demandState.setValue(demand.getDemandState());
        this.approval.setValue(demand.getApproval());
        this.demandMonth.setValue(demand.getDemandMonth());
        this.orderCode.setValue(demand.getOrderCode());
    }

    @Override
    public String toString() {
        return "Demand{" +
                "demandPlanCode=" + demandPlanCode +
                ", demandPlanType=" + demandPlanType +
                ", demandPlanName=" + demandPlanName +
                ", demandRemarks=" + demandRemarks +
                ", demanddepartment=" + demandDepartment +
                ", demandPerson=" + demandPerson +
                ", demandState=" + demandState +
                ", approval=" + approval +
                ", demandMonth=" + demandMonth +
                ", orderCode=" + orderCode +
                '}';
    }
}
