package pro.logic;


import org.springframework.beans.factory.annotation.Autowired;
import pro.entity.Demand;
import pro.mapper.FindAndFix;

import java.util.List;
import java.util.Map;

/*
* 条件查询逻辑
*
* */
public class FindAndFixLogic {
    @Autowired
    FindAndFix find;


    //查找方法
    public void FindBy(Map map){
        List<Demand> demands = find.findBy(map);
    }

}
