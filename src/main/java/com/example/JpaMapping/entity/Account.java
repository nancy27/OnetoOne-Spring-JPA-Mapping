package com.example.JpaMapping.entity;

import javax.persistence.*;

@Entity(name="account")
public class Account {
    @Id
    @Column(name="account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;

    @Column(name = "account_no")
    private int accountNo;

    @Column(name = "employee_id",insertable = false,updatable = false)
    private Integer employeeId;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    public Account() { }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
}
