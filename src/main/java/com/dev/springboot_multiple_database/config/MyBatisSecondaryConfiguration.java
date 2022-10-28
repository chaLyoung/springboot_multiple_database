package com.dev.springboot_multiple_database.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@MapperScan(value="com.dev.springboot_multiple_database.mapper.database2", sqlSessionFactoryRef = "secondarySqlSessionFactory")
@EnableTransactionManagement
public class MyBatisSecondaryConfiguration {
}