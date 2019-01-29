package com.xzha0006.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by James.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String UserName;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

}
