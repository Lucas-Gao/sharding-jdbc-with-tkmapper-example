package xyz.lucas.example.config;

import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import io.shardingjdbc.core.keygen.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ShardingJdbc项目配置类
 * 在此配置一些bean
 * @author lucas.gao.dev@gmail.com
 */
@Configuration
public class ShardingJdbcConfig {

    /**
     * 配置雪花算法id生成器
     * @return shardingjdbc中默认的雪花算法生成器
     */
    @Bean
    public KeyGenerator keyGenerator() {
        return new DefaultKeyGenerator();
    }

}
