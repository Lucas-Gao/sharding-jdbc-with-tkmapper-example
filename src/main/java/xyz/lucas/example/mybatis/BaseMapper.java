package xyz.lucas.example.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 封装后的Mapper
 * @author lucas.gao.dev@gmail.com
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
