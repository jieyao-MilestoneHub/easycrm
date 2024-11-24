package com.example.easycrm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity  // 表的名稱由 JPA/Hibernate 通過實體類的 @Entity 和 @Table 注解確定
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
}
