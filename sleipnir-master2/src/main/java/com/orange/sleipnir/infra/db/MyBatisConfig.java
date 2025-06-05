package com.orange.sleipnir.infra.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.orange.sleipnir.repository.mapper")
public class MyBatisConfig {

}
