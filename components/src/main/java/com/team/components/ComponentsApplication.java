package com.team.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 不自动加载数据源，配置后再加载
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ComponentsApplication {
	private static final Logger logger= LoggerFactory.getLogger(ComponentsApplication.class);

	public static void main(String[] args) {
		logger.info("启动程序");
		SpringApplication.run(ComponentsApplication.class, args);
		logger.error("测试失败日志");
	}

}
