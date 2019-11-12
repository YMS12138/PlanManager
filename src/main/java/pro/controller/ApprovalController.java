package pro.controller;

import pro.logic.ApprovalLogic;

/**
 * 需求审批页面
 */
public class ApprovalController {

    ApprovalLogic app = new ApprovalLogic();//创建Logic对象


    //查找全部审批需求
    public void findAll(){
        app.findAll();
    }
}
