package pro.mapper;

import org.springframework.stereotype.Service;
import pro.entity.Demand;
import pro.entity.Orders;

@Service
public interface IYears {
    public void insertYDemand(Demand demand);
    public void insertYOrder(Orders order);
    public void deleteYByCode(Long Code);
    public void updateYByCode(Long Code);
}
