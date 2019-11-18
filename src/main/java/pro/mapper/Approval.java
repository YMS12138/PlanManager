package pro.mapper;


import org.springframework.stereotype.Service;
import pro.entity.Demand;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public interface Approval {
    public List<Demand> findAll();  //查出所有需求计划

    public List<Demand> findByStatus1();//已审核状态

    public List<Demand> findByStatus2();//未审核状态
}
