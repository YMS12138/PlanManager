package pro.logic;


import org.springframework.beans.factory.annotation.Autowired;
import pro.entity.Demand;
import pro.mapper.Approval;

import java.util.ArrayList;
import java.util.List;

/*
* 需求审批逻辑
* */
public class ApprovalLogic {

    @Autowired
    Approval approval;

    public void findAll(){
        List<Demand> list = new ArrayList<Demand>();
        if(list != null){
            for (Demand ac : list) {
                System.out.println(ac);
            }
            //跳转页面 return
        }else{

        }
    }

}
