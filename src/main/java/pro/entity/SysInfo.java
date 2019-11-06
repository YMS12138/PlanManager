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
    Long orderCode;//外键订单编码

    public SysInfo() {
    }

    public SysInfo(String drawingPeo, Date drawingDate, String modifier, Date modifierDate, String reason, Long orderCode) {
        this.drawingPeo = drawingPeo;
        this.drawingDate = drawingDate;
        this.modifier = modifier;
        this.modifierDate = modifierDate;
        this.reason = reason;
        this.orderCode = orderCode;
    }

    @Override
    public String toString() {
        return "SysInfo{" +
                "drawingPeo='" + drawingPeo + '\'' +
                ", drawingDate=" + drawingDate +
                ", modifier='" + modifier + '\'' +
                ", modifierDate=" + modifierDate +
                ", reason='" + reason + '\'' +
                ", orderCode=" + orderCode +
                '}';
    }
}
