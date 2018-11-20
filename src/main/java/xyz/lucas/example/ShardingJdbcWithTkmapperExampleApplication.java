package xyz.lucas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 * @author lucas.gao.dev@gmail.com
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "xyz.lucas.example.mapper")
public class ShardingJdbcWithTkmapperExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcWithTkmapperExampleApplication.class, args);
    }
}
