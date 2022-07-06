package com.example.mybatis;

import javax.annotation.Generated;

public class Customer {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4091605Z", comments="Source field: public.customer.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4159528Z", comments="Source field: public.customer.first_name")
    private String firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4162569Z", comments="Source field: public.customer.last_name")
    private String lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.412606Z", comments="Source field: public.customer.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4157947Z", comments="Source field: public.customer.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4160594Z", comments="Source field: public.customer.first_name")
    public String getFirstName() {
        return firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.41618Z", comments="Source field: public.customer.first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4163342Z", comments="Source field: public.customer.last_name")
    public String getLastName() {
        return lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.416689Z", comments="Source field: public.customer.last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}