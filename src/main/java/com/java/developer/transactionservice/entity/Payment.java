package com.java.developer.transactionservice.entity;

import com.java.developer.transactionservice.dto.UPIMode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    private String id;
    private String user;
    private double amount;
    private String sourceAc;
    private String destAc;
    @Enumerated(EnumType.STRING)
    private UPIMode upiMode;
}
