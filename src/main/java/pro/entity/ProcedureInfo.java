package pro.entity;/*
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
    Long demandPlanCode;//外键需求计划编码

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getAprovalOpinion() {
        return aprovalOpinion;
    }

    public void setAprovalOpinion(String aprovalOpinion) {
        this.aprovalOpinion = aprovalOpinion;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }

    public ProcedureInfo() {
    }

    @Override
    public String toString() {
        return "ProcedureInfo{" +
                "approver='" + approver + '\'' +
                ", approvalTime=" + approvalTime +
                ", aprovalOpinion='" + aprovalOpinion + '\'' +
                ", explain='" + explain + '\'' +
                ", demandPlanCode=" + demandPlanCode +
                '}';
    }
}
