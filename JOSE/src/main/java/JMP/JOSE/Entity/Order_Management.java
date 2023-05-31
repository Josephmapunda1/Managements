package JMP.JOSE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order_Management")
public class Order_Management {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "Order_ManagementID")
    int Order_ManagementID;
    @Column(name = "Order_ManagementName")
    String Order_ManagementName;
    @Column(name = "Order_ManagementLocation")
    String Order_ManagementLocation;
    @Column(name = "Order_ManagementOwner")
    String Order_ManagementOwner;

}
