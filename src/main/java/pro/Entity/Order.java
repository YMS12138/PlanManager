package pro.Entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:53
 */

import java.util.Date;

/**
 * @program: PlanManager
 * @description: 订单实体类
 * @author: LeeXy
 * @create: 2019-11-04 19:53
 **/

public class Order {
    Long oderCode;//订单编码主键
    int materialTypeCode;//物料分类编码
    String materialTypeName;//物料分类名称
    Long materialCode;//物料编码
    Long materialName;//物料名称
    String materialSpe;//物料规格
    String materialType;//物料型号
    String materialUnit;//物料单位
    int materialNum;//物料数量
    int materialDemandMoth;//物料需求月份
    Date materialDemandDate;//物料需求日期
    Boolean sourceSure;//货源是否确定
    String expectedSup;//期待供应商
    String fixedSup;//固定供应商
    String remarks;//备注
    Long materialTrackCode;//物料追踪码

    /**
     * 默认构造函数
     */
    public Order() {
    }

    public Order(Long oderCode, int materialTypeCode, String materialTypeName, Long materialCode, Long materialName, String materialSpe, String materialType, String materialUnit, int materialNum, int materialDemandMoth, Date materialDemandDate, Boolean sourceSure, String expectedSup, String fixedSup, String remarks, Long materialTrackCode) {
        this.oderCode = oderCode;
        this.materialTypeCode = materialTypeCode;
        this.materialTypeName = materialTypeName;
        this.materialCode = materialCode;
        this.materialName = materialName;
        this.materialSpe = materialSpe;
        this.materialType = materialType;
        this.materialUnit = materialUnit;
        this.materialNum = materialNum;
        this.materialDemandMoth = materialDemandMoth;
        this.materialDemandDate = materialDemandDate;
        this.sourceSure = sourceSure;
        this.expectedSup = expectedSup;
        this.fixedSup = fixedSup;
        this.remarks = remarks;
        this.materialTrackCode = materialTrackCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oderCode=" + oderCode +
                ", materialTypeCode=" + materialTypeCode +
                ", materialTypeName='" + materialTypeName + '\'' +
                ", materialCode=" + materialCode +
                ", materialName=" + materialName +
                ", materialSpe='" + materialSpe + '\'' +
                ", materialType='" + materialType + '\'' +
                ", materialUnit='" + materialUnit + '\'' +
                ", materialNum=" + materialNum +
                ", materialDemandMoth=" + materialDemandMoth +
                ", materialDemandDate=" + materialDemandDate +
                ", sourceSure=" + sourceSure +
                ", expectedSup='" + expectedSup + '\'' +
                ", fixedSup='" + fixedSup + '\'' +
                ", remarks='" + remarks + '\'' +
                ", materialTrackCode=" + materialTrackCode +
                '}';
    }
}
