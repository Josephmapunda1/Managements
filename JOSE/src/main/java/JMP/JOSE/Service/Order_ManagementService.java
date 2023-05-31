package JMP.JOSE.Service;

import JMP.JOSE.Entity.Order_Management;

import java.util.List;

public interface Order_ManagementService {

    //Create
    Order_Management addOrder_Management(Order_Management order_management);
    //Get all Order_Management
    List<Order_Management> getAllOrder_Management();
    //Get Order_Management By Id
    Order_Management getOrder_ManagementById(Long id);
    //Update
    Order_Management updateOrder_Management(Long id, Order_Management order_management);
    //Delete
    void DeleteOrder_Management(Long id);
}
