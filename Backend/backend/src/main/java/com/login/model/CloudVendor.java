package com.login.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cloudVendor")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CloudVendor {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;

    private String vendorName;

    private String vendorAddress;

    private String vendorPhoneNumber;





}
