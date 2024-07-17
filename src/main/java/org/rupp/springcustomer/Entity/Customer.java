package org.rupp.springcustomer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private int id;

    @Column(name = "cus_last_name")
    private String lastname;
    @Column(name = "cus_first_name")
    private String firstname;
    @Column(name = "cus_phoneNumber")
    private String phone;

    public Customer(String lastname, String firstname, String phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
    }
}
