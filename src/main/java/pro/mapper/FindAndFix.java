package pro.mapper;


import org.springframework.stereotype.Service;
import pro.entity.Demand;

import java.util.List;
import java.util.Map;

@Service
public interface FindAndFix {
    public List<Demand> findBy(Map map);  //根据条件进行查询

}
