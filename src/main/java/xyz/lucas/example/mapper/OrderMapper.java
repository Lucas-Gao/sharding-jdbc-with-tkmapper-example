package xyz.lucas.example.mapper;

import xyz.lucas.example.entity.Order;
import xyz.lucas.example.mybatis.BaseMapper;

/**
 * 订单mapper
 * @author lucas.gao.dev@gmail.com
 */

public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 根据订单id查询订单及其关联的条目
     * @param orderId
     * @return
     */
    Order getItemList(Long orderId);
}
