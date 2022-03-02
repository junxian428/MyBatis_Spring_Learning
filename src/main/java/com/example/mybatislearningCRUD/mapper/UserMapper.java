package com.example.mybatislearningCRUD.mapper;

import java.util.List;

import com.example.mybatislearningCRUD.model.Users;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<Users> findAll();

    @Insert("insert into users(name, salary) values(#{name}, #{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    void insert(com.example.mybatislearningCRUD.model.Users users);

    @Update("update users set salary = #{salary} where name = #{name}")
    void update(Users users);

    @Delete("delete from users where name = #{name}")
    void delete(Users users);

}
