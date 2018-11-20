package xyz.lucas.example.mybatis;

import io.shardingjdbc.core.keygen.KeyGenerator;
import tk.mybatis.mapper.genid.GenId;

/**
 * 全局主键 雪花算法GenId
 * @link https://github.com/abel533/Mapper/wiki/2.5-genId
 * @author lucas.gao.dev@gmail.com
 */
public class SnowflakeGenId implements GenId<Long> {

    @Override
    public Long genId(String table, String column) {
        KeyGenerator keyGenerator = ApplicationContextHolder.getBean(KeyGenerator.class);
        return keyGenerator.generateKey().longValue();
    }
}
