package pro.entity;/*
 *@author LeeXy
 *@date 2019/11/4 19:53
 */

import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @program: PlanManager
 * @description: 订单实体类
 * @author: LeeXy
 * @create: 2019-11-04 19:53
 *
 * YMS update-2019/11/15
 **/
@Repository
public class Orders {

    //物料分类编码
    private String materialTypeCode;
    //物料分类名称
    private String materialTypeName;
    //物料编码
    private String materialCode;
    //物料名称
    private String materialName;
    //物料规格
    private String materialSpe;
    //物料型号
    private String materialType;
    //物料单位
    private String materialUnit;
    //物料数量
    private int materialNum;
    //物料需求月份
    private int materialDemandMoth;
    //物料需求日期
    private Date materialDemandDate;
    //货源是否确定
    private Boolean sourceSure;
    //期待供应商
    private String expectedSup;
    //固定供应商
    private String fixedSup;
    //备注
    private String remarks;
    //物料追踪码
    private Long materialTrackCode;
    //需求计划编码
    private Long demandPlanCode;

    public Orders() {
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

    public String getMaterialTypeCode() {
        return materialTypeCode;
    }

    public void setMaterialTypeCode(String materialTypeCode) {
        this.materialTypeCode = materialTypeCode;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
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
