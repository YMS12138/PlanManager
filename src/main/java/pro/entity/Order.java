package pro.entity;/*
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
    Long demandPlanCode;//需求计划编码

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "materialTypeCode=" + materialTypeCode +
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
                ", demandPlanCode=" + demandPlanCode +
                '}';
    }

    public int getMaterialTypeCode() {
        return materialTypeCode;
    }

    public void setMaterialTypeCode(int materialTypeCode) {
        this.materialTypeCode = materialTypeCode;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public Long getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(Long materialCode) {
        this.materialCode = materialCode;
    }

    public Long getMaterialName() {
        return materialName;
    }

    public void setMaterialName(Long materialName) {
        this.materialName = materialName;
    }

    public String getMaterialSpe() {
        return materialSpe;
    }

    public void setMaterialSpe(String materialSpe) {
        this.materialSpe = materialSpe;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public int getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(int materialNum) {
        this.materialNum = materialNum;
    }

    public int getMaterialDemandMoth() {
        return materialDemandMoth;
    }

    public void setMaterialDemandMoth(int materialDemandMoth) {
        this.materialDemandMoth = materialDemandMoth;
    }

    public Date getMaterialDemandDate() {
        return materialDemandDate;
    }

    public void setMaterialDemandDate(Date materialDemandDate) {
        this.materialDemandDate = materialDemandDate;
    }

    public Boolean getSourceSure() {
        return sourceSure;
    }

    public void setSourceSure(Boolean sourceSure) {
        this.sourceSure = sourceSure;
    }

    public String getExpectedSup() {
        return expectedSup;
    }

    public void setExpectedSup(String expectedSup) {
        this.expectedSup = expectedSup;
    }

    public String getFixedSup() {
        return fixedSup;
    }

    public void setFixedSup(String fixedSup) {
        this.fixedSup = fixedSup;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getMaterialTrackCode() {
        return materialTrackCode;
    }

    public void setMaterialTrackCode(Long materialTrackCode) {
        this.materialTrackCode = materialTrackCode;
    }

    public Long getDemandPlanCode() {
        return demandPlanCode;
    }

    public void setDemandPlanCode(Long demandPlanCode) {
        this.demandPlanCode = demandPlanCode;
    }
}
