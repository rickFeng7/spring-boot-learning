package com.rick.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author fengrui
 * @date 2024/3/25
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableBatchProcessing
public class SpringBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }
}
