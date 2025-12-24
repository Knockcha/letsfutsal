package io.github.wizwix.letsfutsal.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan("io.github.wizwix.letsfutsal.mapper")
public class MyBatisConfig {

	@Bean
	public DataSource dataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/letsfutsal?serverTimezone=UTC");
		ds.setUsername("letsfutsal");
		ds.setPassword("letsfutsal");
		return ds;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(ds);
		return factory.getObject();
	}
}