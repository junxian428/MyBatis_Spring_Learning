package com.example.mybatislearningCRUD;

import com.example.mybatislearningCRUD.model.Users;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.example.mybatislearningCRUD.mapper")
@SpringBootApplication
public class MybatisLearningCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisLearningCrudApplication.class, args);
	}

}
