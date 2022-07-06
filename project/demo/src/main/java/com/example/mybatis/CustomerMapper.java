package com.example.mybatis;

import static com.example.mybatis.CustomerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mybatis.Customer;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface CustomerMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Customer>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4770657Z", comments="Source Table: public.customer")
    BasicColumn[] selectList = BasicColumn.columnList(id, firstName, lastName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4397255Z", comments="Source Table: public.customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CustomerResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR)
    })
    List<Customer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4502292Z", comments="Source Table: public.customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CustomerResult")
    Optional<Customer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4528341Z", comments="Source Table: public.customer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4542484Z", comments="Source Table: public.customer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4576371Z", comments="Source Table: public.customer")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4611024Z", comments="Source Table: public.customer")
    default int insert(Customer row) {
        return MyBatis3Utils.insert(this::insert, row, customer, c ->
            c.map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4678566Z", comments="Source Table: public.customer")
    default int insertMultiple(Collection<Customer> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, customer, c ->
            c.map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4728795Z", comments="Source Table: public.customer")
    default int insertSelective(Customer row) {
        return MyBatis3Utils.insert(this::insert, row, customer, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(firstName).toPropertyWhenPresent("firstName", row::getFirstName)
            .map(lastName).toPropertyWhenPresent("lastName", row::getLastName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4801419Z", comments="Source Table: public.customer")
    default Optional<Customer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4824656Z", comments="Source Table: public.customer")
    default List<Customer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4836606Z", comments="Source Table: public.customer")
    default List<Customer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4849299Z", comments="Source Table: public.customer")
    default Optional<Customer> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4862055Z", comments="Source Table: public.customer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4873316Z", comments="Source Table: public.customer")
    static UpdateDSL<UpdateModel> updateAllColumns(Customer row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(firstName).equalTo(row::getFirstName)
                .set(lastName).equalTo(row::getLastName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4891858Z", comments="Source Table: public.customer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Customer row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(firstName).equalToWhenPresent(row::getFirstName)
                .set(lastName).equalToWhenPresent(row::getLastName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4914158Z", comments="Source Table: public.customer")
    default int updateByPrimaryKey(Customer row) {
        return update(c ->
            c.set(firstName).equalTo(row::getFirstName)
            .set(lastName).equalTo(row::getLastName)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-06T02:21:22.4951895Z", comments="Source Table: public.customer")
    default int updateByPrimaryKeySelective(Customer row) {
        return update(c ->
            c.set(firstName).equalToWhenPresent(row::getFirstName)
            .set(lastName).equalToWhenPresent(row::getLastName)
            .where(id, isEqualTo(row::getId))
        );
    }
}