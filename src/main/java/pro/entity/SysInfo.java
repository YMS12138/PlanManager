package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 20:33
 */

import java.util.Date;

/**
 * @program: PlanManager
 * @description: 系统信息
 * @author: LeeXy
 * @create: 2019-11-04 20:33
 **/

public class SysInfo {
    String drawingPeo;//绘制人
    Date drawingDate;//绘制时间
    String modifier;//修改人
    Date modifierDate;//修改时间
    String reason;//原因
    Long demandPlanCode;//外键需求计划编码

    public SysInfo() {
    }

    public String getDrawingPeo() {
        return drawingPeo;
    }

    public void setDrawingPeo(String drawingPeo) {
        this.drawingPeo = drawingPeo;
    }

    public Date getDrawingDate() {
        return drawingDate;
    }

    public void setDrawingDate(Date drawingDate) {
        this.drawingDate = drawingDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifierDate() {
        return modifierDate;
    }

    public void setModifierDate(Date modifierDate) {
        this.modifierDate = modifierDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }

    @Override
    public String toString() {
        return "SysInfo{" +
                "drawingPeo='" + drawingPeo + '\'' +
                ", drawingDate=" + drawingDate +
                ", modifier='" + modifier + '\'' +
                ", modifierDate=" + modifierDate +
                ", reason='" + reason + '\'' +
                ", demandPlanCode=" + demandPlanCode +
                '}';
    }
}
