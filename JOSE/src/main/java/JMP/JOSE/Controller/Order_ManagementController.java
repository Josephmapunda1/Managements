package JMP.JOSE.Controller;
import JMP.JOSE.Entity.Order_Management;
import JMP.JOSE.Service.Order_ManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Order_Management")
public class Order_ManagementController {
    Order_ManagementService order_managementService;

    public Order_ManagementController(Order_ManagementService order_managementService) {
        this.order_managementService = order_managementService;
    }
    //Create
    @PostMapping
    public ResponseEntity<Order_Management> addOrder_Management(@RequestBody Order_Management order_management){
        return new ResponseEntity<>(order_managementService.addOrder_Management(order_management), HttpStatus.CREATED);
    }
    //Get All
    @GetMapping
    List<Order_Management> getAllOrder_Management(){
        return order_managementService.getAllOrder_Management();
    }
    //Get By id
    @GetMapping({"id"})
    public ResponseEntity<Order_Management> GetById(@PathVariable Long id){
        return new ResponseEntity<>(order_managementService.getOrder_ManagementById(id), HttpStatus.OK);
    }
    //Update
    @PutMapping({"id"})
    public  ResponseEntity<Order_Management> UpdateOrder_Management(@PathVariable Long id,@RequestBody Order_Management order_management){
        return new ResponseEntity<>(order_managementService.updateOrder_Management(id, order_management),HttpStatus.OK);
    }
    //Delete
    @DeleteMapping({"id"})
    public ResponseEntity<String> DeleteOrder_Management (@PathVariable Long id){
        order_managementService.DeleteOrder_Management(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
}
