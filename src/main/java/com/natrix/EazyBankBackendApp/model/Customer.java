package com.natrix.EazyBankBackendApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native")
    @Column(name = "customer_id")
    private Integer customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number", nullable = false, unique = true)
    private String mobile;

    @Column(name = "customer_password", length = 60, nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String customerPassword;

    @Column(nullable = false)
    private String role;

    @Column(name = "customer_create_date")
    private Date customerCreateDate;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Authority> authorities;

}
