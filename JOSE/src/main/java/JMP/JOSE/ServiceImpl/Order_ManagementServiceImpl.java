package JMP.JOSE.ServiceImpl;

import JMP.JOSE.Entity.Order_Management;
import JMP.JOSE.Exception.Order_ManagementException;
import JMP.JOSE.Repository.Order_ManagementRepository;
import JMP.JOSE.Service.Order_ManagementService;

import java.util.List;

public class Order_ManagementServiceImpl implements Order_ManagementService {
    private Order_ManagementRepository order_managementRepository;

    public Order_ManagementServiceImpl(Order_ManagementRepository order_managementRepository) {
        this.order_managementRepository = order_managementRepository;
    }

    @Override
    public Order_Management addOrder_Management(Order_Management order_management) {
        return order_managementRepository.save(order_management);
    }

    @Override
    public List<Order_Management> getAllOrder_Management() {
        return order_managementRepository.findAll();
    }

    @Override
    public Order_Management getOrder_ManagementById(Long id) {
        Order_Management order_management=order_managementRepository.findById(id)
                .orElseThrow(()->new Order_ManagementException("Not found"));
        return order_management;
    }

    @Override
    public Order_Management updateOrder_Management(Long id, Order_Management order_management) {
        Order_Management order_management1=order_managementRepository.findById(id)
                .orElseThrow(()->new Order_ManagementException("Not found"));
        order_management1.setOrder_ManagementID(order_management.getOrder_ManagementID());
        order_management1.setOrder_ManagementName(order_management.getOrder_ManagementName());
        order_management1.setOrder_ManagementLocation(order_management.getOrder_ManagementLocation());

        Order_Management UpdateOrder_Management=order_managementRepository.save(order_management1);

        return UpdateOrder_Management;
    }

    @Override
    public void DeleteOrder_Management(Long id) {
        Order_Management order_management=order_managementRepository.findById(id)
                .orElseThrow(()->new Order_ManagementException("Not found"));

        order_managementRepository.delete(order_management);

    }
}
