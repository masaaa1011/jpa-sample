package com.example.mybatis;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CustomerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4308628Z", comments="Source Table: public.customer")
    public static final Customer customer = new Customer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4349761Z", comments="Source field: public.customer.id")
    public static final SqlColumn<Long> id = customer.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4367287Z", comments="Source field: public.customer.first_name")
    public static final SqlColumn<String> firstName = customer.firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4371028Z", comments="Source field: public.customer.last_name")
    public static final SqlColumn<String> lastName = customer.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4346479Z", comments="Source Table: public.customer")
    public static final class Customer extends AliasableSqlTable<Customer> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> firstName = column("first_name", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("last_name", JDBCType.VARCHAR);

        public Customer() {
            super("public.customer", Customer::new);
        }
    }
}