package pro.mapper;


import org.springframework.stereotype.Service;
import pro.entity.Demand;

import java.util.List;

@Service
public interface Approval {
    public List<Demand> findAll();  //查出所有需求计划

}
