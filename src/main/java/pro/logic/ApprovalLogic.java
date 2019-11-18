package pro.logic;


import org.springframework.stereotype.Service;
import pro.Application;
import pro.entity.Demand;
import pro.mapper.Approval;

import java.util.List;

/**
 * 需求审批逻辑
 */
@Service
public class ApprovalLogic {


    /* @Autowired
     Approval approval;
     */
    public List<Demand> findAll() {
        Approval approval = Application.ac.getBean("approval", Approval.class);
        List<Demand> list = approval.findAll();
        return list;
    }

    //已审核
    public List<Demand> findByStatus1() {
        Approval approval = Application.ac.getBean("approval", Approval.class);
        List<Demand> list = approval.findByStatus1();
        return list;
    }

    //未审核
    public List<Demand> findByStatus2() {
        Approval approval = Application.ac.getBean("approval", Approval.class);
        List<Demand> list = approval.findByStatus2();
        return list;
    }
}
