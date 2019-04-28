package com.example.hello.DAO;

import com.example.hello.Entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/4/27.
 */
@Mapper
public interface IAccountDAO {
    @Insert("insert into user(id,name,money) values (#{id},#{name},#{money})")
    int add(@Param("id") int id,@Param("name") String name, @Param("money") double money);

    @Update("update user set name = #{name}, money = #{money} where id = #{id}")
    int update(Account account);
}
